package defpackage;

import defpackage.gk3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: va3  reason: default package */
/* loaded from: classes.dex */
public final class va3 extends hw6 implements eo2 {
    public final /* synthetic */ wa3 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va3(wa3 wa3Var, r41 r41Var) {
        super(2, r41Var);
        this.X = wa3Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        jg7 jg7Var = jg7.a;
        ((va3) q((r41) obj2, (w61) obj)).s(jg7Var);
        return jg7Var;
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new va3(this.X, r41Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0025 A[SYNTHETIC] */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        gk3 gk3Var;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        wa3 wa3Var = this.X;
        File file = new File(wa3Var.a.getFilesDir(), "layouts.json");
        try {
            ArrayList arrayList = new ArrayList();
            for (fh1 fh1Var : (Iterable) wa3Var.f.getValue()) {
                if (!fh1Var.b) {
                    Object obj2 = fh1Var.a;
                    if (((fk3) obj2).c != dk3.DEFAULT) {
                        gk3Var = gk3.a.a((fk3) obj2);
                        if (gk3Var == null) {
                            arrayList.add(gk3Var);
                        }
                    }
                }
                gk3Var = null;
                if (gk3Var == null) {
                }
            }
            String f = wa3Var.b.f(arrayList);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file));
            outputStreamWriter.write(f);
            outputStreamWriter.close();
            wa3Var.c.i();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jg7.a;
    }
}
