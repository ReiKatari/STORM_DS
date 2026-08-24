package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j51  reason: default package */
/* loaded from: classes.dex */
public final class j51 extends defpackage.s {
    public static final android.os.Parcelable.Creator<defpackage.j51> CREATOR = null;
    public android.util.SparseArray L;

    static {
            lm6 r0 = new lm6
            r1 = 2
            r0.<init>(r1)
            defpackage.j51.CREATOR = r0
            return
    }

    public j51(android.os.Parcel r6, java.lang.ClassLoader r7) {
            r5 = this;
            r5.<init>(r6, r7)
            int r0 = r6.readInt()
            int[] r1 = new int[r0]
            r6.readIntArray(r1)
            android.os.Parcelable[] r6 = r6.readParcelableArray(r7)
            android.util.SparseArray r7 = new android.util.SparseArray
            r7.<init>(r0)
            r5.L = r7
            r7 = 0
        L18:
            if (r7 >= r0) goto L26
            android.util.SparseArray r2 = r5.L
            r3 = r1[r7]
            r4 = r6[r7]
            r2.append(r3, r4)
            int r7 = r7 + 1
            goto L18
        L26:
            return
    }

    @Override // defpackage.s, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            super.writeToParcel(r6, r7)
            android.util.SparseArray r0 = r5.L
            r1 = 0
            if (r0 == 0) goto Ld
            int r0 = r0.size()
            goto Le
        Ld:
            r0 = r1
        Le:
            r6.writeInt(r0)
            int[] r2 = new int[r0]
            android.os.Parcelable[] r3 = new android.os.Parcelable[r0]
        L15:
            if (r1 >= r0) goto L2c
            android.util.SparseArray r4 = r5.L
            int r4 = r4.keyAt(r1)
            r2[r1] = r4
            android.util.SparseArray r4 = r5.L
            java.lang.Object r4 = r4.valueAt(r1)
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            r3[r1] = r4
            int r1 = r1 + 1
            goto L15
        L2c:
            r6.writeIntArray(r2)
            r6.writeParcelableArray(r3, r7)
            return
    }
}
