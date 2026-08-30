package defpackage;

import android.net.Uri;
import java.util.Map;
import me.magnum.melonds.domain.model.RendererConfiguration;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rs  reason: default package */
/* loaded from: classes.dex */
public final class rs extends nk6 implements bj2 {
    public final /* synthetic */ int X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rs(int i, int i2, j11 j11Var) {
        super(i, j11Var);
        this.X = i2;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                rs rsVar = new rs(3, 0, (j11) obj3);
                rsVar.Y = booleanValue;
                rsVar.Z = (Uri[]) obj2;
                return rsVar.v(o27Var);
            case 1:
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                rs rsVar2 = new rs(3, 1, (j11) obj3);
                rsVar2.Z = (RendererConfiguration) obj;
                rsVar2.Y = booleanValue2;
                return rsVar2.v(o27Var);
            case 2:
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                rs rsVar3 = new rs(3, 2, (j11) obj3);
                rsVar3.Z = (Map) obj;
                rsVar3.Y = booleanValue3;
                return rsVar3.v(o27Var);
            default:
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                rs rsVar4 = new rs(3, 3, (j11) obj3);
                rsVar4.Z = (l46) obj;
                rsVar4.Y = booleanValue4;
                return rsVar4.v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        switch (this.X) {
            case 0:
                boolean z = this.Y;
                Uri[] uriArr = (Uri[]) this.Z;
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (z) {
                    return (Uri) nu.q0(uriArr);
                }
                return null;
            case 1:
                boolean z2 = this.Y;
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return new ti4((RendererConfiguration) this.Z, Boolean.valueOf(z2));
            case 2:
                Map map = (Map) this.Z;
                boolean z3 = this.Y;
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (!z3) {
                    return qp1.A;
                }
                return map;
            default:
                l46 l46Var = (l46) this.Z;
                boolean z4 = this.Y;
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return new l46(l46Var.a, l46Var.b, l46Var.c, l46Var.d, l46Var.e, z4);
        }
    }
}
