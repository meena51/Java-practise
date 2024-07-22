const readLine = require('readline');
const rl = readLine.createInterface({
    input : process.stdin,
    output : process.stdout
});
rl.question('Enter something: ', (input) => {
    console.log(`You entered: ${input}`);
    rl.close();
  });