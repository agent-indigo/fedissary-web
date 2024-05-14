import type {Config} from 'tailwindcss'
const config: Config = {
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