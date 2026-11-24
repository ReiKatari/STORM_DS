#!/usr/bin/env bash
set -euo pipefail
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
MP_ROOT="$(cd "$SCRIPT_DIR/../.." && pwd)"
cmake -S "$MP_ROOT/native" -B "$MP_ROOT/native/build-linux-x64" -DCMAKE_BUILD_TYPE=Release
cmake --build "$MP_ROOT/native/build-linux-x64" --config Release -j"$(nproc)"
dotnet publish "$MP_ROOT/src/StormDs.Desktop/StormDs.Desktop.csproj" -c Release -r linux-x64 -p:PublishAot=true -o "$MP_ROOT/dist/linux-x64"
cp -f "$MP_ROOT/native/build-linux-x64/libstorm_ds_core.so" "$MP_ROOT/dist/linux-x64/libstorm_ds_core.so"
echo "Linux x64 NativeAOT bundle ready in $MP_ROOT/dist/linux-x64"
