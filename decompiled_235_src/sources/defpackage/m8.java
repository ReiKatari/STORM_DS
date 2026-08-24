package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m8  reason: default package */
/* loaded from: classes.dex */
public final class m8 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m8(int i, r41 r41Var, int i2) {
        super(i, r41Var);
        this.X = i2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((m8) q((r41) obj2, (oh0) obj)).s(jg7Var);
            case 1:
                return ((m8) q((r41) obj2, (oh0) obj)).s(jg7Var);
            case 2:
                return ((m8) q((r41) obj2, (oh0) obj)).s(jg7Var);
            case 3:
                return ((m8) q((r41) obj2, (fk3) obj)).s(jg7Var);
            case 4:
                return ((m8) q((r41) obj2, (ff5) obj)).s(jg7Var);
            case 5:
                return ((m8) q((r41) obj2, (ue4) obj)).s(jg7Var);
            case 6:
                return ((m8) q((r41) obj2, (ue4) obj)).s(jg7Var);
            case 7:
                return ((m8) q((r41) obj2, (oh0) obj)).s(jg7Var);
            case 8:
                ((m8) q((r41) obj2, (cd) obj)).s(jg7Var);
                return jg7Var;
            default:
                return ((m8) q((r41) obj2, (ch6) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                m8 m8Var = new m8(2, r41Var, 0);
                m8Var.Y = obj;
                return m8Var;
            case 1:
                m8 m8Var2 = new m8(2, r41Var, 1);
                m8Var2.Y = obj;
                return m8Var2;
            case 2:
                m8 m8Var3 = new m8(2, r41Var, 2);
                m8Var3.Y = obj;
                return m8Var3;
            case 3:
                m8 m8Var4 = new m8(2, r41Var, 3);
                m8Var4.Y = obj;
                return m8Var4;
            case 4:
                m8 m8Var5 = new m8(2, r41Var, 4);
                m8Var5.Y = obj;
                return m8Var5;
            case 5:
                m8 m8Var6 = new m8(2, r41Var, 5);
                m8Var6.Y = obj;
                return m8Var6;
            case 6:
                m8 m8Var7 = new m8(2, r41Var, 6);
                m8Var7.Y = obj;
                return m8Var7;
            case 7:
                m8 m8Var8 = new m8(2, r41Var, 7);
                m8Var8.Y = obj;
                return m8Var8;
            case 8:
                m8 m8Var9 = new m8(2, r41Var, 8);
                m8Var9.Y = obj;
                return m8Var9;
            default:
                m8 m8Var10 = new m8(2, r41Var, 9);
                m8Var10.Y = obj;
                return m8Var10;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        boolean z = false;
        switch (this.X) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                oh0 oh0Var = (oh0) this.Y;
                if ((oh0Var instanceof uh0) || (oh0Var instanceof th0)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return Boolean.valueOf(((oh0) this.Y) instanceof th0);
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return Boolean.valueOf(!(((oh0) this.Y) instanceof di0));
            case 3:
                fk3 fk3Var = (fk3) this.Y;
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (fk3Var != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (((ff5) this.Y) == ff5.ShutDown) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                ue4 ue4Var = (ue4) this.Y;
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (ue4Var == ue4.CONNECTED) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                ue4 ue4Var2 = (ue4) this.Y;
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (ue4Var2 == ue4.DISCONNECTED) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return Boolean.valueOf(!nb3.k((oh0) this.Y, di0.a));
            case 8:
                x61 x61Var9 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                ((cd) this.Y).a(RecyclerView.B1);
                return jg7.a;
            default:
                x61 x61Var10 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (((ch6) this.Y) != ch6.START) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
