export const api = (() => {
    const link = 'https://lab01-back.herokuapp.com/'

    return {
        toCelsius: async fahrenheit => {
            return await fetch(`${link}/fahrenheit/${fahrenheit}`).then(
                result => {
                    return result.json();
                }
            );
        },

        toFahrenheit: async celsius => {
            return await fetch(`${link}/celsius/${celsius}`).then(
                result => {
                    return result.json();
                }
            );
        },
    }
})();