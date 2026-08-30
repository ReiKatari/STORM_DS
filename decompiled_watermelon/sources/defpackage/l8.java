package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l8  reason: default package */
/* loaded from: classes.dex */
public final class l8 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l8(int i, int i2, j11 j11Var) {
        super(i, j11Var);
        this.X = i2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return ((l8) t((j11) obj2, (ff0) obj)).v(o27Var);
            case 1:
                return ((l8) t((j11) obj2, (ff0) obj)).v(o27Var);
            case 2:
                return ((l8) t((j11) obj2, (ff0) obj)).v(o27Var);
            case 3:
                return ((l8) t((j11) obj2, (nd3) obj)).v(o27Var);
            case 4:
                return ((l8) t((j11) obj2, (p55) obj)).v(o27Var);
            case 5:
                return ((l8) t((j11) obj2, (g64) obj)).v(o27Var);
            case ig7.b /* 6 */:
                return ((l8) t((j11) obj2, (g64) obj)).v(o27Var);
            case 7:
                return ((l8) t((j11) obj2, (ff0) obj)).v(o27Var);
            case 8:
                ((l8) t((j11) obj2, (oc) obj)).v(o27Var);
                return o27Var;
            default:
                return ((l8) t((j11) obj2, (p56) obj)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                l8 l8Var = new l8(2, 0, j11Var);
                l8Var.Y = obj;
                return l8Var;
            case 1:
                l8 l8Var2 = new l8(2, 1, j11Var);
                l8Var2.Y = obj;
                return l8Var2;
            case 2:
                l8 l8Var3 = new l8(2, 2, j11Var);
                l8Var3.Y = obj;
                return l8Var3;
            case 3:
                l8 l8Var4 = new l8(2, 3, j11Var);
                l8Var4.Y = obj;
                return l8Var4;
            case 4:
                l8 l8Var5 = new l8(2, 4, j11Var);
                l8Var5.Y = obj;
                return l8Var5;
            case 5:
                l8 l8Var6 = new l8(2, 5, j11Var);
                l8Var6.Y = obj;
                return l8Var6;
            case ig7.b /* 6 */:
                l8 l8Var7 = new l8(2, 6, j11Var);
                l8Var7.Y = obj;
                return l8Var7;
            case 7:
                l8 l8Var8 = new l8(2, 7, j11Var);
                l8Var8.Y = obj;
                return l8Var8;
            case 8:
                l8 l8Var9 = new l8(2, 8, j11Var);
                l8Var9.Y = obj;
                return l8Var9;
            default:
                l8 l8Var10 = new l8(2, 9, j11Var);
                l8Var10.Y = obj;
                return l8Var10;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        boolean z = false;
        switch (this.X) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                ff0 ff0Var = (ff0) this.Y;
                if ((ff0Var instanceof lf0) || (ff0Var instanceof kf0)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return Boolean.valueOf(((ff0) this.Y) instanceof kf0);
            case 2:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return Boolean.valueOf(!(((ff0) this.Y) instanceof uf0));
            case 3:
                nd3 nd3Var = (nd3) this.Y;
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (nd3Var != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                p31 p31Var5 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (((p55) this.Y) == p55.ShutDown) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                g64 g64Var = (g64) this.Y;
                p31 p31Var6 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (g64Var == g64.CONNECTED) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case ig7.b /* 6 */:
                g64 g64Var2 = (g64) this.Y;
                p31 p31Var7 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (g64Var2 == g64.DISCONNECTED) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                p31 p31Var8 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return Boolean.valueOf(!b53.x((ff0) this.Y, uf0.a));
            case 8:
                p31 p31Var9 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                ((oc) this.Y).a(RecyclerView.A1);
                return o27.a;
            default:
                p31 p31Var10 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (((p56) this.Y) != p56.START) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
