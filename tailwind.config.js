/**
 * @type  {import('tailwindcss').Config}
 */
const config = {
  content: ["./src/**/*.{jsx,tsx}"],
  plugins: [require('daisyui')],
  daisyui: {
    themes: [
      "aqua",
      "night"
    ]
  }
}
export default config