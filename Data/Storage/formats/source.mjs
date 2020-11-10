import { default as cjs } from 'cjs';

// The following import statement is "syntax sugar" (equivalent but sweeter)
// for `{ default as cjsSugar }` in the above import statement:
import cjsSugar from 'cjs';

readFile('./foo.txt', (err, source) => {
    if (err) {
        console.error(err);
    } else {
        console.log(source);
    }
});

console.log(cjs);
console.log(cjs === cjsSugar);
// Prints:
//   <module.exports>
//   true