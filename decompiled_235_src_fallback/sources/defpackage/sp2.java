package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sp2  reason: default package */
/* loaded from: classes.dex */
public final class sp2 implements com.google.android.gms.tasks.OnFailureListener, defpackage.mb0 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.rj0 B;

    public /* synthetic */ sp2(defpackage.rj0 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.mb0
    public void c(defpackage.gb0 r3, defpackage.vl5 r4) {
            r2 = this;
            int r0 = r2.A
            rj0 r2 = r2.B
            switch(r0) {
                case 1: goto L25;
                case 2: goto Lb;
                default: goto L7;
            }
        L7:
            r2.i(r4)
            return
        Lb:
            wl5 r3 = r4.a
            boolean r3 = r3.m0
            if (r3 == 0) goto L17
            java.lang.Object r3 = r4.b
            r2.i(r3)
            goto L24
        L17:
            ug r3 = new ug
            r3.<init>(r4)
            em5 r4 = new em5
            r4.<init>(r3)
            r2.i(r4)
        L24:
            return
        L25:
            wl5 r0 = r4.a
            boolean r0 = r0.m0
            if (r0 == 0) goto L8b
            java.lang.Object r4 = r4.b
            if (r4 != 0) goto L87
            pa r3 = r3.x()
            r3.getClass()
            java.lang.Class<ac3> r4 = defpackage.ac3.class
            ar0 r4 = defpackage.gh5.a(r4)
            java.lang.Class r0 = r4.a
            r0.getClass()
            java.lang.Object r3 = r3.Y
            qo2 r3 = (defpackage.qo2) r3
            java.lang.Object r3 = r3.A(r4)
            java.lang.Object r3 = r0.cast(r3)
            r3.getClass()
            ac3 r3 = (defpackage.ac3) r3
            java.lang.reflect.Method r3 = r3.b
            ti3 r4 = new ti3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Response from "
            r0.<init>(r1)
            java.lang.Class<yr2> r1 = defpackage.yr2.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            java.lang.String r3 = " was null but response body type was declared as non-null"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            em5 r3 = new em5
            r3.<init>(r4)
            r2.i(r3)
            goto L98
        L87:
            r2.i(r4)
            goto L98
        L8b:
            ug r3 = new ug
            r3.<init>(r4)
            em5 r4 = new em5
            r4.<init>(r3)
            r2.i(r4)
        L98:
            return
    }

    @Override // defpackage.mb0
    public void f(defpackage.gb0 r1, java.lang.Throwable r2) {
            r0 = this;
            int r1 = r0.A
            rj0 r0 = r0.B
            switch(r1) {
                case 1: goto L19;
                case 2: goto L10;
                default: goto L7;
            }
        L7:
            em5 r1 = new em5
            r1.<init>(r2)
            r0.i(r1)
            return
        L10:
            em5 r1 = new em5
            r1.<init>(r2)
            r0.i(r1)
            return
        L19:
            em5 r1 = new em5
            r1.<init>(r2)
            r0.i(r1)
            return
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(java.lang.Exception r2) {
            r1 = this;
            r2.getClass()
            rj0 r1 = r1.B
            java.lang.Object r0 = r1.u()
            boolean r0 = r0 instanceof defpackage.sg4
            if (r0 == 0) goto L15
            em5 r0 = new em5
            r0.<init>(r2)
            r1.i(r0)
        L15:
            return
    }
}
