package defpackage;

import android.net.Uri;
import java.util.Map;
import me.magnum.melonds.domain.model.RendererConfiguration;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: et  reason: default package */
/* loaded from: classes.dex */
public final class et extends hw6 implements fo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ et(int i, r41 r41Var, int i2) {
        super(i, r41Var);
        this.X = i2;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                et etVar = new et(3, (r41) obj3, 0);
                etVar.Y = booleanValue;
                etVar.Z = (Uri[]) obj2;
                return etVar.s(jg7Var);
            case 1:
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                et etVar2 = new et(3, (r41) obj3, 1);
                etVar2.Z = (RendererConfiguration) obj;
                etVar2.Y = booleanValue2;
                return etVar2.s(jg7Var);
            case 2:
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                et etVar3 = new et(3, (r41) obj3, 2);
                etVar3.Z = (Map) obj;
                etVar3.Y = booleanValue3;
                return etVar3.s(jg7Var);
            default:
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                et etVar4 = new et(3, (r41) obj3, 3);
                etVar4.Z = (xf6) obj;
                etVar4.Y = booleanValue4;
                return etVar4.s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        switch (this.X) {
            case 0:
                boolean z = this.Y;
                Uri[] uriArr = (Uri[]) this.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (z) {
                    return (Uri) fv.E0(uriArr);
                }
                return null;
            case 1:
                boolean z2 = this.Y;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return new vr4((RendererConfiguration) this.Z, Boolean.valueOf(z2));
            case 2:
                Map map = (Map) this.Z;
                boolean z3 = this.Y;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (!z3) {
                    return zt1.A;
                }
                return map;
            default:
                xf6 xf6Var = (xf6) this.Z;
                boolean z4 = this.Y;
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return new xf6(xf6Var.a, xf6Var.b, xf6Var.c, xf6Var.d, xf6Var.e, z4);
        }
    }
}
