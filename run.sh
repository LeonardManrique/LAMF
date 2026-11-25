#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")"

OUT=build/classes
mkdir -p "$OUT"
javac -encoding UTF-8 -d "$OUT" src/laboratoriopolimorfismo/*.java
java -cp "$OUT" laboratoriopolimorfismo.ProgramaInterfaz
