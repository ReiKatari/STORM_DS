package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dn0  reason: default package */
/* loaded from: classes.dex */
public final class dn0 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.dn0> CREATOR = null;
    public final java.lang.Long A;
    public final java.lang.String B;
    public final java.util.ArrayList L;

    static {
            y8 r0 = new y8
            r1 = 6
            r0.<init>(r1)
            defpackage.dn0.CREATOR = r0
            return
    }

    public dn0(java.lang.Long r1, java.lang.String r2, java.util.ArrayList r3) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            return
    }

    public final defpackage.an0 a() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            java.util.ArrayList r2 = r5.L
            int r1 = defpackage.ht0.v0(r2, r1)
            r0.<init>(r1)
            int r1 = r2.size()
            r3 = 0
        L12:
            if (r3 >= r1) goto L24
            java.lang.Object r4 = r2.get(r3)
            int r3 = r3 + 1
            ho0 r4 = (defpackage.ho0) r4
            me.magnum.melonds.domain.model.Cheat r4 = r4.a()
            r0.add(r4)
            goto L12
        L24:
            an0 r1 = new an0
            java.lang.Long r2 = r5.A
            java.lang.String r5 = r5.B
            r1.<init>(r2, r5, r0)
            return r1
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
            java.util.ArrayList r3 = r3.L
            int r1 = r3.size()
            r4.writeInt(r1)
            int r1 = r3.size()
        L29:
            if (r0 >= r1) goto L37
            java.lang.Object r2 = r3.get(r0)
            int r0 = r0 + 1
            ho0 r2 = (defpackage.ho0) r2
            r2.writeToParcel(r4, r5)
            goto L29
        L37:
            return
    }
}
