package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pp2  reason: default package */
/* loaded from: classes.dex */
public final class pp2 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.pp2> CREATOR = null;
    public final java.lang.Long A;
    public final java.lang.String B;
    public final java.lang.String L;
    public final java.lang.String R;
    public final java.util.ArrayList X;

    static {
            y8 r0 = new y8
            r1 = 14
            r0.<init>(r1)
            defpackage.pp2.CREATOR = r0
            return
    }

    public pp2(java.lang.Long r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.util.ArrayList r5) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            return
    }

    public final defpackage.cp2 a() {
            r6 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            java.util.ArrayList r1 = r6.X
            int r0 = defpackage.ht0.v0(r1, r0)
            r5.<init>(r0)
            int r0 = r1.size()
            r2 = 0
        L12:
            if (r2 >= r0) goto L24
            java.lang.Object r3 = r1.get(r2)
            int r2 = r2 + 1
            dn0 r3 = (defpackage.dn0) r3
            an0 r3 = r3.a()
            r5.add(r3)
            goto L12
        L24:
            cp2 r0 = new cp2
            java.lang.Long r1 = r6.A
            java.lang.String r2 = r6.B
            java.lang.String r3 = r6.L
            java.lang.String r4 = r6.R
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r4.getClass()
            r0 = 0
            java.lang.Long r1 = r3.A
            if (r1 != 0) goto Lc
            r4.writeInt(r0)
            goto L17
        Lc:
            r2 = 1
            r4.writeInt(r2)
            long r1 = r1.longValue()
            r4.writeLong(r1)
        L17:
            java.lang.String r1 = r3.B
            r4.writeString(r1)
            java.lang.String r1 = r3.L
            r4.writeString(r1)
            java.lang.String r1 = r3.R
            r4.writeString(r1)
            java.util.ArrayList r3 = r3.X
            int r1 = r3.size()
            r4.writeInt(r1)
            int r1 = r3.size()
        L33:
            if (r0 >= r1) goto L41
            java.lang.Object r2 = r3.get(r0)
            int r0 = r0 + 1
            dn0 r2 = (defpackage.dn0) r2
            r2.writeToParcel(r4, r5)
            goto L33
        L41:
            return
    }
}
