package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oo3  reason: default package */
/* loaded from: classes.dex */
public final class oo3 extends defpackage.uj2 {
    public static final defpackage.lw0 k = null;
    public final defpackage.dp3 h;
    public final defpackage.ei i;
    public boolean j;

    static {
            lw0 r0 = new lw0
            r1 = 29
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.oo3.k = r0
            return
    }

    public oo3(defpackage.qn2 r2) {
            r1 = this;
            r1.<init>()
            dp3 r0 = new dp3
            r0.<init>(r1)
            r1.h = r0
            ei r0 = new ei
            r0.<init>()
            r1.i = r0
            r2.g(r1)
            return
    }

    public static void g0(defpackage.oo3 r5, java.lang.String r6, defpackage.gn5 r7, defpackage.zv0 r8, int r9) {
            r9 = r9 & 2
            if (r9 == 0) goto L5
            r7 = 0
        L5:
            ei r9 = r5.i
            cr3 r0 = new cr3
            r1 = 0
            r0.<init>(r6, r1)
            if (r7 == 0) goto L15
            no3 r6 = new no3
            r6.<init>(r1, r7)
            goto L17
        L15:
            lw0 r6 = defpackage.oo3.k
        L17:
            v83 r1 = new v83
            r2 = 11
            r1.<init>(r2)
            fj r2 = new fj
            r3 = 4
            r2.<init>(r8, r3)
            zv0 r8 = new zv0
            r3 = -291643851(0xffffffffee9dde35, float:-2.442889E28)
            r4 = 1
            r8.<init>(r3, r4, r2)
            mo3 r2 = new mo3
            r2.<init>(r0, r6, r1, r8)
            r9.a(r4, r2)
            if (r7 == 0) goto L39
            r5.j = r4
        L39:
            return
    }

    @Override // defpackage.uj2
    public final defpackage.ei J() {
            r0 = this;
            ei r0 = r0.i
            return r0
    }

    public final void h0(int r3, defpackage.qn2 r4, defpackage.qn2 r5, defpackage.zv0 r6) {
            r2 = this;
            mo3 r0 = new mo3
            lw0 r1 = defpackage.oo3.k
            r0.<init>(r4, r1, r5, r6)
            ei r2 = r2.i
            r2.a(r3, r0)
            return
    }
}
