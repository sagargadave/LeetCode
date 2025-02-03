/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var reverseStr = function (s, k) {
    let i = 0;
    let str = s.split('')

    while (i < str.length) {

        if (k > str.length - i) {
            reverse(str, i, str.length - 1)
        } else {
            reverse(str, i, i + k - 1)
        }

        i += 2 * k
    }

    return str.join('')

};

const reverse = (s, start, end) => {

    let i = start, j = end;

    if (s.length === 0) return s

    while (i < j) {
        let temp = s[i]
        s[i] = s[j]
        s[j] = temp
        i++;
        j--
    }

    return s

}