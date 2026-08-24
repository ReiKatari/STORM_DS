package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k87  reason: default package */
/* loaded from: classes.dex */
public final class k87 extends defpackage.uj2 {
    public final /* synthetic */ int h;
    public boolean i;
    public int j;
    public final /* synthetic */ java.lang.Object k;

    public k87(defpackage.jp7 r2) {
            r1 = this;
            r0 = 1
            r1.h = r0
            r1.<init>()
            r1.k = r2
            r2 = 0
            r1.i = r2
            r1.j = r2
            return
    }

    public k87(defpackage.l87 r2, int r3) {
            r1 = this;
            r0 = 0
            r1.h = r0
            r1.<init>()
            r1.k = r2
            r1.j = r3
            r1.i = r0
            return
    }

    @Override // defpackage.uj2, defpackage.kp7
    public void a() {
            r1 = this;
            int r0 = r1.h
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            r0 = 1
            r1.i = r0
            return
    }

    @Override // defpackage.uj2, defpackage.kp7
    public final void b() {
            r2 = this;
            int r0 = r2.h
            java.lang.Object r1 = r2.k
            switch(r0) {
                case 0: goto L19;
                default: goto L7;
            }
        L7:
            boolean r0 = r2.i
            if (r0 == 0) goto Lc
            goto L18
        Lc:
            r0 = 1
            r2.i = r0
            jp7 r1 = (defpackage.jp7) r1
            kp7 r2 = r1.d
            if (r2 == 0) goto L18
            r2.b()
        L18:
            return
        L19:
            l87 r1 = (defpackage.l87) r1
            androidx.appcompat.widget.Toolbar r2 = r1.a
            r0 = 0
            r2.setVisibility(r0)
            return
    }

    @Override // defpackage.kp7
    public final void c() {
            r3 = this;
            int r0 = r3.h
            java.lang.Object r1 = r3.k
            switch(r0) {
                case 0: goto L26;
                default: goto L7;
            }
        L7:
            int r0 = r3.j
            int r0 = r0 + 1
            r3.j = r0
            jp7 r1 = (defpackage.jp7) r1
            java.util.ArrayList r2 = r1.a
            int r2 = r2.size()
            if (r0 != r2) goto L25
            kp7 r0 = r1.d
            if (r0 == 0) goto L1e
            r0.c()
        L1e:
            r0 = 0
            r3.j = r0
            r3.i = r0
            r1.e = r0
        L25:
            return
        L26:
            boolean r0 = r3.i
            if (r0 != 0) goto L33
            l87 r1 = (defpackage.l87) r1
            androidx.appcompat.widget.Toolbar r0 = r1.a
            int r3 = r3.j
            r0.setVisibility(r3)
        L33:
            return
    }
}
