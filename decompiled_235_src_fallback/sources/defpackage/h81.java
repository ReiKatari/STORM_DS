package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h81  reason: default package */
/* loaded from: classes.dex */
public final class h81 extends defpackage.o42 {
    public final /* synthetic */ int e;

    public /* synthetic */ h81(defpackage.n42 r1, int r2) {
            r0 = this;
            r0.e = r2
            r0.<init>(r1)
            return
    }

    @Override // defpackage.o42
    public void q() {
            r1 = this;
            int r0 = r1.e
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            n42 r1 = r1.b
            r0 = 0
            r1.n0 = r0
            com.google.android.material.internal.CheckableImageButton r1 = r1.f0
            r1.setOnLongClickListener(r0)
            defpackage.kj2.Y(r1, r0)
            return
    }
}
