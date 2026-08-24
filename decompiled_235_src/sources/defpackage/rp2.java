package defpackage;

import com.google.mlkit.vision.text.Text;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rp2  reason: default package */
/* loaded from: classes.dex */
public final class rp2 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ rj0 B;

    public /* synthetic */ rp2(rj0 rj0Var, int i) {
        this.A = i;
        this.B = rj0Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        rj0 rj0Var = this.B;
        switch (i) {
            case 0:
                Text text = (Text) obj;
                if (rj0Var.u() instanceof sg4) {
                    text.getClass();
                    rj0Var.G(text, null);
                }
                return jg7Var;
            default:
                Throwable th = (Throwable) obj;
                rj0Var.i(jg7Var);
                return jg7Var;
        }
    }
}
