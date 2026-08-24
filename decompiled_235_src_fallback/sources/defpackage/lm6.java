package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lm6  reason: default package */
/* loaded from: classes.dex */
public final class lm6 implements android.os.Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ lm6(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    public static defpackage.mm6 a(android.os.Parcel r4, java.lang.ClassLoader r5) {
            if (r5 != 0) goto L8
            java.lang.Class<lm6> r5 = defpackage.lm6.class
            java.lang.ClassLoader r5 = r5.getClassLoader()
        L8:
            int r0 = r4.readInt()
            if (r0 != 0) goto L14
            mm6 r4 = new mm6
            r4.<init>()
            return r4
        L14:
            qk6 r1 = defpackage.qk6.B
            jw4 r1 = r1.f()
            r2 = 0
        L1b:
            if (r2 >= r0) goto L27
            java.lang.Object r3 = r4.readValue(r5)
            r1.add(r3)
            int r2 = r2 + 1
            goto L1b
        L27:
            mm6 r4 = new mm6
            h1 r5 = r1.c()
            r4.<init>(r5)
            return r4
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r2) {
            r1 = this;
            int r1 = r1.a
            r0 = 0
            switch(r1) {
                case 0: goto L24;
                case 1: goto L1e;
                case 2: goto L18;
                case 3: goto L12;
                case 4: goto Lc;
                default: goto L6;
            }
        L6:
            n37 r1 = new n37
            r1.<init>(r2, r0)
            return r1
        Lc:
            v86 r1 = new v86
            r1.<init>(r2, r0)
            return r1
        L12:
            y14 r1 = new y14
            r1.<init>(r2, r0)
            return r1
        L18:
            j51 r1 = new j51
            r1.<init>(r2, r0)
            return r1
        L1e:
            j60 r1 = new j60
            r1.<init>(r2, r0)
            return r1
        L24:
            mm6 r1 = a(r2, r0)
            return r1
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final java.lang.Object createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L23;
                case 1: goto L1d;
                case 2: goto L17;
                case 3: goto L11;
                case 4: goto Lb;
                default: goto L5;
            }
        L5:
            n37 r0 = new n37
            r0.<init>(r1, r2)
            return r0
        Lb:
            v86 r0 = new v86
            r0.<init>(r1, r2)
            return r0
        L11:
            y14 r0 = new y14
            r0.<init>(r1, r2)
            return r0
        L17:
            j51 r0 = new j51
            r0.<init>(r1, r2)
            return r0
        L1d:
            j60 r0 = new j60
            r0.<init>(r1, r2)
            return r0
        L23:
            mm6 r0 = a(r1, r2)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int r1) {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L14;
                case 1: goto L11;
                case 2: goto Le;
                case 3: goto Lb;
                case 4: goto L8;
                default: goto L5;
            }
        L5:
            n37[] r0 = new defpackage.n37[r1]
            return r0
        L8:
            v86[] r0 = new defpackage.v86[r1]
            return r0
        Lb:
            y14[] r0 = new defpackage.y14[r1]
            return r0
        Le:
            j51[] r0 = new defpackage.j51[r1]
            return r0
        L11:
            j60[] r0 = new defpackage.j60[r1]
            return r0
        L14:
            mm6[] r0 = new defpackage.mm6[r1]
            return r0
    }
}
