package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dr7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dr7 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ qr7 B;

    public /* synthetic */ dr7(qr7 qr7Var, int i) {
        this.A = i;
        this.B = qr7Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        ja em5Var;
        Object value;
        Object value2;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        qr7 qr7Var = this.B;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    tp6 tp6Var = qr7Var.e;
                    try {
                        em5Var = qr7Var.d.p(uri);
                    } catch (Throwable th) {
                        em5Var = new em5(th);
                    }
                    if (!(em5Var instanceof em5)) {
                        ja jaVar = (ja) em5Var;
                        do {
                            value2 = tp6Var.getValue();
                        } while (!tp6Var.j(value2, pr7.a((pr7) value2, false, null, null, null, null, null, null, null, null, null, lb1.A("Драйвер ", jaVar.b, " успешно импортирован!"), 1023)));
                        qr7Var.f();
                    }
                    if (hm5.a(em5Var) != null) {
                        do {
                            value = tp6Var.getValue();
                        } while (!tp6Var.j(value, pr7.a((pr7) value, false, null, null, null, null, null, null, null, null, null, "Не удалось импортировать драйвер из ZIP", 1023)));
                    }
                }
                return jg7Var;
            case 1:
                String str = (String) obj;
                str.getClass();
                qr7Var.g(str);
                return jg7Var;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                qr7Var.g(str2);
                return jg7Var;
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                qr7Var.d.D(str3);
                qr7Var.f();
                return jg7Var;
            default:
                hm4 hm4Var = (hm4) obj;
                hm4Var.getClass();
                qr7Var.e(hm4Var);
                return jg7Var;
        }
    }
}
