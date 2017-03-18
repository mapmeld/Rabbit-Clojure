# Rabbit-Clojure

A Unicode <-> Zawgyi converter for Clojure, based on other Rabbit Converter code
in other languages.

## Usage

```clojure
; convert Unicode to Zawgyi
(uni2zg "မင်္ဂလာပါ")

; convert Zawgyi to Unicode
(zg2uni "မဂၤလာပါ")
```

### Testing

```bash
lein test
```

## License

Open source, MIT license
