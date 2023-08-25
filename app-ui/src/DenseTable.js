import * as React from 'react';
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';


export default function DenseTable() {
  const [rowData, setRowData] = React.useState([])
  
  const fetchTangoData = () => {
    fetch("/api/tango/all")
      .then(response => {
        return response.json()
      })
      .then(data => {
        setRowData(data)
      })
  }
  React.useEffect(() => {
    fetchTangoData()
  }, [])

  return (
    <TableContainer component={Paper}>
      <Table sx={{ minWidth: 650 }} size="small" aria-label="a dense table">
        <TableHead>
          <TableRow>
            <TableCell>单词</TableCell>
            <TableCell>假名</TableCell>
            <TableCell>词类</TableCell>
            <TableCell>含义</TableCell>
            <TableCell>课号</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {rowData.map((row) => (
            <TableRow
              key={row.id}
              sx={{ '&:last-child td, &:last-child th': { border: 0 } }}
            >
              <TableCell>{row.word}</TableCell>
              <TableCell>{row.kana}</TableCell>
              <TableCell></TableCell>
              <TableCell></TableCell>
              <TableCell></TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>
  );
}
