package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yw0  reason: default package */
/* loaded from: classes.dex */
public final class yw0 extends java.lang.RuntimeException {
    public final defpackage.ca4 A;
    public final defpackage.ca4 B;
    public final defpackage.o94 L;
    public final int R;

    public yw0(defpackage.ca4 r1, defpackage.ca4 r2, defpackage.o94 r3, int r4, java.lang.Exception r5) {
            r0 = this;
            r0.<init>(r5)
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            return
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n            |Failed to execute op number "
            r0.<init>(r1)
            int r1 = r8.R
            r0.append(r1)
            java.lang.String r1 = ":\n            |"
            r0.append(r1)
            xw0 r1 = new xw0
            r2 = 0
            r1.<init>(r8, r2)
            rb6 r8 = defpackage.qo2.C(r1)
            boolean r1 = r8.hasNext()
            if (r1 != 0) goto L24
            yt1 r8 = defpackage.yt1.A
            goto L4a
        L24:
            java.lang.Object r1 = r8.next()
            boolean r2 = r8.hasNext()
            if (r2 != 0) goto L33
            java.util.List r8 = defpackage.hf.b0(r1)
            goto L4a
        L33:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r1)
        L3b:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r8.next()
            r2.add(r1)
            goto L3b
        L49:
            r8 = r2
        L4a:
            r1 = 50
            java.util.List r2 = defpackage.gt0.f1(r1, r8)
            r6 = 0
            r7 = 62
            java.lang.String r3 = "\n"
            r4 = 0
            r5 = 0
            java.lang.String r8 = defpackage.gt0.P0(r2, r3, r4, r5, r6, r7)
            r0.append(r8)
            java.lang.String r8 = "\n            "
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r8 = defpackage.rs6.S(r8)
            return r8
    }
}
