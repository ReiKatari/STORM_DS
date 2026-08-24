package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d80  reason: default package */
/* loaded from: classes.dex */
public final class d80 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ d80(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                ((tj0) obj2).cancel();
                return jg7Var;
            case 1:
                Throwable th2 = (Throwable) obj;
                ((je5) obj2).cancel();
                return jg7Var;
            default:
                float[] fArr = ((v24) obj).a;
                jk3 jk3Var = (jk3) obj2;
                if (jk3Var.t()) {
                    ej2.w(jk3Var).l(jk3Var, fArr);
                }
                return jg7Var;
        }
    }
}
