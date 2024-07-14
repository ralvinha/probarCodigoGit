const fs = require('node:fs')

console.log('Leyendo el primer archivo...')
const text = fs.readFile('./archivo.txt', 'utf-8')

console.log(text) // Hola mundo

console.log('Leyendo el segundo archivo...')
const secondText = fs.readFile('./archivo2.txt', 'utf-8')

console.log(secondText) 

