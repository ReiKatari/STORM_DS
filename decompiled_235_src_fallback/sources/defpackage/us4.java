package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: us4  reason: default package */
/* loaded from: classes.dex */
public final class us4 implements android.os.Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ us4(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    public static defpackage.vs4 a(android.os.Parcel r2, java.lang.ClassLoader r3) {
            if (r3 != 0) goto L8
            java.lang.Class<us4> r3 = defpackage.us4.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
        L8:
            java.lang.Object r3 = r2.readValue(r3)
            int r2 = r2.readInt()
            vs4 r0 = new vs4
            if (r2 == 0) goto L2d
            r1 = 1
            if (r2 == r1) goto L2a
            r1 = 2
            if (r2 != r1) goto L1d
            vs0 r2 = defpackage.vs0.s0
            goto L2f
        L1d:
            java.lang.String r3 = "Unsupported MutableState policy "
            java.lang.String r0 = " was restored"
            java.lang.String r2 = defpackage.lb1.k(r3, r2, r0)
            defpackage.i.m(r2)
            r2 = 0
            return r2
        L2a:
            xd5 r2 = defpackage.xd5.s0
            goto L2f
        L2d:
            vs0 r2 = defpackage.vs0.j0
        L2f:
            r0.<init>(r3, r2)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r2) {
            r1 = this;
            int r1 = r1.a
            r0 = 0
            switch(r1) {
                case 0: goto L33;
                case 1: goto L24;
                case 2: goto L1e;
                case 3: goto L18;
                case 4: goto L12;
                case 5: goto Lc;
                default: goto L6;
            }
        L6:
            g87 r1 = new g87
            r1.<init>(r2, r0)
            return r1
        Lc:
            oh6 r1 = new oh6
            r1.<init>(r2, r0)
            return r1
        L12:
            pg5 r1 = new pg5
            r1.<init>(r2, r0)
            return r1
        L18:
            tk2 r1 = new tk2
            r1.<init>(r2, r0)
            return r1
        L1e:
            cq0 r1 = new cq0
            r1.<init>(r2, r0)
            return r1
        L24:
            android.os.Parcelable r1 = r2.readParcelable(r0)
            if (r1 != 0) goto L2d
            r r0 = defpackage.s.B
            goto L32
        L2d:
            java.lang.String r1 = "superState must be null"
            defpackage.i.m(r1)
        L32:
            return r0
        L33:
            vs4 r1 = a(r2, r0)
            return r1
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final java.lang.Object createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L33;
                case 1: goto L23;
                case 2: goto L1d;
                case 3: goto L17;
                case 4: goto L11;
                case 5: goto Lb;
                default: goto L5;
            }
        L5:
            g87 r0 = new g87
            r0.<init>(r1, r2)
            return r0
        Lb:
            oh6 r0 = new oh6
            r0.<init>(r1, r2)
            return r0
        L11:
            pg5 r0 = new pg5
            r0.<init>(r1, r2)
            return r0
        L17:
            tk2 r0 = new tk2
            r0.<init>(r1, r2)
            return r0
        L1d:
            cq0 r0 = new cq0
            r0.<init>(r1, r2)
            return r0
        L23:
            android.os.Parcelable r0 = r1.readParcelable(r2)
            if (r0 != 0) goto L2c
            r r0 = defpackage.s.B
            goto L32
        L2c:
            java.lang.String r0 = "superState must be null"
            defpackage.i.m(r0)
            r0 = 0
        L32:
            return r0
        L33:
            vs4 r0 = a(r1, r2)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int r1) {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L17;
                case 1: goto L14;
                case 2: goto L11;
                case 3: goto Le;
                case 4: goto Lb;
                case 5: goto L8;
                default: goto L5;
            }
        L5:
            g87[] r0 = new defpackage.g87[r1]
            return r0
        L8:
            oh6[] r0 = new defpackage.oh6[r1]
            return r0
        Lb:
            pg5[] r0 = new defpackage.pg5[r1]
            return r0
        Le:
            tk2[] r0 = new defpackage.tk2[r1]
            return r0
        L11:
            cq0[] r0 = new defpackage.cq0[r1]
            return r0
        L14:
            s[] r0 = new defpackage.s[r1]
            return r0
        L17:
            vs4[] r0 = new defpackage.vs4[r1]
            return r0
    }
}
