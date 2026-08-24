package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jg4  reason: default package */
/* loaded from: classes.dex */
public class jg4 {
    public final defpackage.ua4 a;
    public final defpackage.ca4 b;

    public jg4() {
            r2 = this;
            r2.<init>()
            ua4 r0 = new ua4
            r1 = 16
            zf4[] r1 = new defpackage.zf4[r1]
            r0.<init>(r1)
            r2.a = r0
            ca4 r0 = new ca4
            r1 = 10
            r0.<init>(r1)
            r2.b = r0
            return
    }

    public boolean a(defpackage.hz3 r6, defpackage.jk3 r7, defpackage.yc1 r8, boolean r9) {
            r5 = this;
            ua4 r5 = r5.a
            java.lang.Object[] r0 = r5.A
            int r5 = r5.L
            r1 = 0
            r2 = r1
            r3 = r2
        L9:
            if (r2 >= r5) goto L1e
            r4 = r0[r2]
            zf4 r4 = (defpackage.zf4) r4
            boolean r4 = r4.a(r6, r7, r8, r9)
            if (r4 != 0) goto L1a
            if (r3 == 0) goto L18
            goto L1a
        L18:
            r3 = r1
            goto L1b
        L1a:
            r3 = 1
        L1b:
            int r2 = r2 + 1
            goto L9
        L1e:
            return r3
    }

    public void b(defpackage.yc1 r2) {
            r1 = this;
            ua4 r1 = r1.a
            int r2 = r1.L
            int r2 = r2 + (-1)
        L6:
            r0 = -1
            if (r0 >= r2) goto L1b
            java.lang.Object[] r0 = r1.A
            r0 = r0[r2]
            zf4 r0 = (defpackage.zf4) r0
            zb r0 = r0.d
            int r0 = r0.B
            if (r0 != 0) goto L18
            r1.l(r2)
        L18:
            int r2 = r2 + (-1)
            goto L6
        L1b:
            return
    }
}
