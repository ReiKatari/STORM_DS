package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: em7  reason: default package */
/* loaded from: classes.dex */
public final class em7 extends defpackage.dm7 {
    public final android.util.SparseIntArray d;
    public final android.os.Parcel e;
    public final int f;
    public final int g;
    public final java.lang.String h;
    public int i;
    public int j;
    public int k;

    public em7(android.os.Parcel r9) {
            r8 = this;
            int r2 = r9.dataPosition()
            int r3 = r9.dataSize()
            wu r5 = new wu
            r0 = 0
            r5.<init>(r0)
            wu r6 = new wu
            r6.<init>(r0)
            wu r7 = new wu
            r7.<init>(r0)
            java.lang.String r4 = ""
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public em7(android.os.Parcel r1, int r2, int r3, java.lang.String r4, defpackage.wu r5, defpackage.wu r6, defpackage.wu r7) {
            r0 = this;
            r0.<init>(r5, r6, r7)
            android.util.SparseIntArray r5 = new android.util.SparseIntArray
            r5.<init>()
            r0.d = r5
            r5 = -1
            r0.i = r5
            r0.k = r5
            r0.e = r1
            r0.f = r2
            r0.g = r3
            r0.j = r2
            r0.h = r4
            return
    }

    @Override // defpackage.dm7
    public final defpackage.em7 a() {
            r8 = this;
            em7 r0 = new em7
            android.os.Parcel r1 = r8.e
            int r2 = r1.dataPosition()
            int r3 = r8.j
            int r4 = r8.f
            if (r3 != r4) goto L10
            int r3 = r8.g
        L10:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r8.h
            java.lang.String r6 = "  "
            java.lang.String r4 = defpackage.i61.n(r4, r5, r6)
            wu r6 = r8.b
            wu r7 = r8.c
            wu r5 = r8.a
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // defpackage.dm7
    public final boolean e(int r4) {
            r3 = this;
        L0:
            int r0 = r3.j
            int r1 = r3.k
            int r2 = r3.g
            if (r0 >= r2) goto L31
            if (r1 != r4) goto Lb
            goto L33
        Lb:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r4)
            int r0 = r0.compareTo(r1)
            if (r0 <= 0) goto L1a
            goto L35
        L1a:
            int r0 = r3.j
            android.os.Parcel r1 = r3.e
            r1.setDataPosition(r0)
            int r0 = r1.readInt()
            int r1 = r1.readInt()
            r3.k = r1
            int r1 = r3.j
            int r1 = r1 + r0
            r3.j = r1
            goto L0
        L31:
            if (r1 != r4) goto L35
        L33:
            r3 = 1
            return r3
        L35:
            r3 = 0
            return r3
    }

    @Override // defpackage.dm7
    public final void h(int r6) {
            r5 = this;
            int r0 = r5.i
            android.util.SparseIntArray r1 = r5.d
            android.os.Parcel r2 = r5.e
            if (r0 < 0) goto L1b
            int r0 = r1.get(r0)
            int r3 = r2.dataPosition()
            int r4 = r3 - r0
            r2.setDataPosition(r0)
            r2.writeInt(r4)
            r2.setDataPosition(r3)
        L1b:
            r5.i = r6
            int r5 = r2.dataPosition()
            r1.put(r6, r5)
            r5 = 0
            r2.writeInt(r5)
            r2.writeInt(r6)
            return
    }
}
