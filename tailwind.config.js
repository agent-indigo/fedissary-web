import daisyui from 'daisyui'
const tailwindConfig = {
  content: [
    '**/*.{jsx,tsx}'
  ],
  plugins: [
    daisyui
  ],
  daisyui: {
    themes: [
      "aqua",
      "night"
    ]
  }
}
export default tailwindConfig
