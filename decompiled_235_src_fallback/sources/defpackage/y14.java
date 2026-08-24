package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y14  reason: default package */
/* loaded from: classes.dex */
public final class y14 extends defpackage.s {
    public static final android.os.Parcelable.Creator<defpackage.y14> CREATOR = null;
    public boolean L;

    static {
            lm6 r0 = new lm6
            r1 = 3
            r0.<init>(r1)
            defpackage.y14.CREATOR = r0
            return
    }

    public y14(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            if (r2 != 0) goto La
            java.lang.Class<y14> r2 = defpackage.y14.class
            r2.getClassLoader()
        La:
            int r1 = r1.readInt()
            r2 = 1
            if (r1 != r2) goto L12
            goto L13
        L12:
            r2 = 0
        L13:
            r0.L = r2
            return
    }

    @Override // defpackage.s, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            boolean r0 = r0.L
            r1.writeInt(r0)
            return
    }
}
