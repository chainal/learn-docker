import * as React from 'react';
import Container from '@mui/material/Container';
import Typography from '@mui/material/Typography';
import Box from '@mui/material/Box';
import Link from '@mui/material/Link';
import ProTip from './ProTip';
import BasicTabs from './BasicTabs'
import ClippedDrawer from './ClippedDrawer';

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
    <ClippedDrawer />
    // <Container maxWidth="lg">
     
    //   <Box sx={{ my: 4 }}>
    //     <Typography variant="h4" component="h1" gutterBottom>
    //       十三番機
    //     </Typography>
    //     <BasicTabs />
    //     <ProTip />
    //     <Copyright />
    //   </Box>
    // </Container>
  );
}
