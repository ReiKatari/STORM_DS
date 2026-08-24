package defpackage;

import android.content.Context;
import android.net.Uri;
import defpackage.gk3;
import java.io.OutputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k20  reason: default package */
/* loaded from: classes.dex */
public final class k20 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ fk3 Y;
    public final /* synthetic */ Context Z;
    public final /* synthetic */ Uri d0;
    public final /* synthetic */ zn3 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k20(fk3 fk3Var, Context context, Uri uri, zn3 zn3Var, r41 r41Var) {
        super(2, r41Var);
        this.Y = fk3Var;
        this.Z = context;
        this.d0 = uri;
        this.e0 = zn3Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((k20) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new k20(this.Y, this.Z, this.d0, this.e0, r41Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
        if (r8 != r0) goto L7;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        zn3 zn3Var = this.e0;
        try {
        } catch (Exception e) {
            e.printStackTrace();
            xe1 xe1Var = xk1.a;
            jv2 jv2Var = e04.a;
            j20 j20Var = new j20(zn3Var, null, 1);
            this.X = 2;
            obj = hv.d0(jv2Var, j20Var, this);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    oi2.Y(obj);
                    jg7 jg7Var = (jg7) obj;
                    return jg7.a;
                }
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oi2.Y(obj);
        } else {
            oi2.Y(obj);
            String f = new su2().f(gk3.a.a(this.Y));
            OutputStream openOutputStream = this.Z.getContentResolver().openOutputStream(this.d0);
            if (openOutputStream != null) {
                byte[] bytes = f.getBytes(qm0.a);
                bytes.getClass();
                openOutputStream.write(bytes);
                openOutputStream.close();
            }
            xe1 xe1Var2 = xk1.a;
            jv2 jv2Var2 = e04.a;
            j20 j20Var2 = new j20(zn3Var, null, 0);
            this.X = 1;
            obj = hv.d0(jv2Var2, j20Var2, this);
            if (obj == x61Var) {
                return x61Var;
            }
        }
        jg7 jg7Var2 = (jg7) obj;
        return jg7.a;
    }
}
