package com.github.junrar.volume;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class InputStreamVolumeManager implements com.github.junrar.volume.VolumeManager {
    private final java.util.Map<java.lang.Integer, java.io.InputStream> streams;

    public InputStreamVolumeManager(java.io.InputStream r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.streams = r0
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r1, r2)
            return
    }

    public InputStreamVolumeManager(java.util.List<java.io.InputStream> r5) {
            r4 = this;
            r4.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.streams = r0
            r0 = 0
        Lb:
            int r1 = r5.size()
            if (r0 >= r1) goto L22
            java.util.Map<java.lang.Integer, java.io.InputStream> r1 = r4.streams
            int r2 = r0 + 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r5.get(r0)
            r1.put(r3, r0)
            r0 = r2
            goto Lb
        L22:
            return
    }

    @Override // com.github.junrar.volume.VolumeManager
    public com.github.junrar.volume.Volume nextVolume(com.github.junrar.Archive r3, com.github.junrar.volume.Volume r4) {
            r2 = this;
            r0 = 1
            if (r4 != 0) goto L15
            com.github.junrar.volume.InputStreamVolume r4 = new com.github.junrar.volume.InputStreamVolume
            java.util.Map<java.lang.Integer, java.io.InputStream> r2 = r2.streams
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r2.get(r1)
            java.io.InputStream r2 = (java.io.InputStream) r2
            r4.<init>(r3, r2, r0)
            return r4
        L15:
            com.github.junrar.volume.InputStreamVolume r4 = (com.github.junrar.volume.InputStreamVolume) r4
            int r4 = r4.getPosition()
            int r4 = r4 + r0
            java.util.Map<java.lang.Integer, java.io.InputStream> r2 = r2.streams
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = r2.get(r0)
            java.io.InputStream r2 = (java.io.InputStream) r2
            if (r2 == 0) goto L30
            com.github.junrar.volume.InputStreamVolume r0 = new com.github.junrar.volume.InputStreamVolume
            r0.<init>(r3, r2, r4)
            return r0
        L30:
            r2 = 0
            return r2
    }
}
