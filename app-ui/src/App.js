import * as React from 'react';
import Container from '@mui/material/Container';
import Typography from '@mui/material/Typography';
import Box from '@mui/material/Box';
import Link from '@mui/material/Link';
import ProTip from './ProTip';
import Button from '@mui/material/Button';
import Alert from '@mui/material/Alert';
import Stack from '@mui/material/Stack';
import TextField from '@mui/material/TextField';
import Grid from '@mui/material/Grid';

function Copyright() {
  return (
    <Typography variant="body2" color="text.secondary" align="center">
      {'Copyright © '}
      <Link color="inherit" href="https://mui.com/">
        Your Website
      </Link>{' '}
      {new Date().getFullYear()}
      {'.'}
    </Typography>
  );
}

export default function App() {
  return (
    <Container maxWidth="lg">
      <Box sx={{ my: 4 }}>
        <Typography variant="h4" component="h1" gutterBottom>
          Docker站点
        </Typography>
        <Stack spacing={2}>
          <Box>
            <TextField id="outlined-basic" label="Outlined" variant="outlined"
                       InputProps={{endAdornment: <Button variant="text">Text</Button>}} />
          </Box>
          <Alert severity="info">This is an info alert — check it out!</Alert>
        </Stack>
        <ProTip />
        <Copyright />
      </Box>
    </Container>
  );
}
