import { default as cjs } from 'cjs';

// The following import statement is "syntax sugar" (equivalent but sweeter)
// for `{ default as cjsSugar }` in the above import statement:
import cjsSugar from 'cjsggtgth';

readFile('./foo.txt', (err, source) => {
    if (err) {
        syncBuiltinESMExports();
        console.error(err);
    } else {
        console.log(source);
    }
});

console.log(cjs === cjsSugar);
// Prints:
//   <module.exports>
//   true