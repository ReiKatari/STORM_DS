package defpackage;

import me.magnum.melonds.ui.romlist.RomListActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iy5  reason: default package */
/* loaded from: classes.dex */
public final class iy5 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ RomListActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iy5(RomListActivity romListActivity, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = romListActivity;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((iy5) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((iy5) q(r41Var, w61Var)).s(jg7Var);
            case 2:
                return ((iy5) q(r41Var, w61Var)).s(jg7Var);
            case 3:
                return ((iy5) q(r41Var, w61Var)).s(jg7Var);
            case 4:
                return ((iy5) q(r41Var, w61Var)).s(jg7Var);
            case 5:
                return ((iy5) q(r41Var, w61Var)).s(jg7Var);
            case 6:
                return ((iy5) q(r41Var, w61Var)).s(jg7Var);
            case 7:
                return ((iy5) q(r41Var, w61Var)).s(jg7Var);
            case 8:
                return ((iy5) q(r41Var, w61Var)).s(jg7Var);
            case 9:
                return ((iy5) q(r41Var, w61Var)).s(jg7Var);
            case 10:
                return ((iy5) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((iy5) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        RomListActivity romListActivity = this.Z;
        switch (i) {
            case 0:
                return new iy5(romListActivity, r41Var, 0);
            case 1:
                return new iy5(romListActivity, r41Var, 1);
            case 2:
                return new iy5(romListActivity, r41Var, 2);
            case 3:
                return new iy5(romListActivity, r41Var, 3);
            case 4:
                return new iy5(romListActivity, r41Var, 4);
            case 5:
                return new iy5(romListActivity, r41Var, 5);
            case 6:
                return new iy5(romListActivity, r41Var, 6);
            case 7:
                return new iy5(romListActivity, r41Var, 7);
            case 8:
                return new iy5(romListActivity, r41Var, 8);
            case 9:
                return new iy5(romListActivity, r41Var, 9);
            case 10:
                return new iy5(romListActivity, r41Var, 10);
            default:
                return new iy5(romListActivity, r41Var, 11);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        RomListActivity romListActivity = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                int i3 = RomListActivity.K0;
                of6 of6Var = romListActivity.C().y;
                lo0 lo0Var = new lo0(romListActivity, (r41) null, 2);
                this.Y = 1;
                if (f04.v(of6Var, lo0Var, this) == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                tt3 tt3Var = tt3.STARTED;
                iy5 iy5Var = new iy5(romListActivity, null, 0);
                this.Y = 1;
                if (np2.d0(romListActivity, tt3Var, iy5Var, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                int i6 = RomListActivity.K0;
                of6 of6Var2 = romListActivity.C().A;
                jy5 jy5Var = new jy5(romListActivity, null, 0);
                this.Y = 1;
                if (f04.v(of6Var2, jy5Var, this) == x61Var3) {
                    return x61Var3;
                }
                return jg7Var;
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                tt3 tt3Var2 = tt3.STARTED;
                iy5 iy5Var2 = new iy5(romListActivity, null, 2);
                this.Y = 1;
                if (np2.d0(romListActivity, tt3Var2, iy5Var2, this) == x61Var4) {
                    return x61Var4;
                }
                return jg7Var;
            case 4:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i8 = this.Y;
                if (i8 != 0) {
                    if (i8 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                int i9 = RomListActivity.K0;
                of6 of6Var3 = romListActivity.C().B;
                jy5 jy5Var2 = new jy5(romListActivity, null, 1);
                this.Y = 1;
                if (f04.v(of6Var3, jy5Var2, this) == x61Var5) {
                    return x61Var5;
                }
                return jg7Var;
            case 5:
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                tt3 tt3Var3 = tt3.STARTED;
                iy5 iy5Var3 = new iy5(romListActivity, null, 4);
                this.Y = 1;
                if (np2.d0(romListActivity, tt3Var3, iy5Var3, this) == x61Var6) {
                    return x61Var6;
                }
                return jg7Var;
            case 6:
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                int i11 = this.Y;
                if (i11 != 0) {
                    if (i11 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                int i12 = RomListActivity.K0;
                vl0 vl0Var = romListActivity.B().e;
                ly5 ly5Var = new ly5(romListActivity, null, 0);
                this.Y = 1;
                if (f04.v(vl0Var, ly5Var, this) == x61Var7) {
                    return x61Var7;
                }
                return jg7Var;
            case 7:
                x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                int i13 = this.Y;
                if (i13 != 0) {
                    if (i13 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                tt3 tt3Var4 = tt3.STARTED;
                iy5 iy5Var4 = new iy5(romListActivity, null, 6);
                this.Y = 1;
                if (np2.d0(romListActivity, tt3Var4, iy5Var4, this) == x61Var8) {
                    return x61Var8;
                }
                return jg7Var;
            case 8:
                x61 x61Var9 = x61.COROUTINE_SUSPENDED;
                int i14 = this.Y;
                if (i14 != 0) {
                    if (i14 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                int i15 = RomListActivity.K0;
                vl0 vl0Var2 = romListActivity.B().g;
                ly5 ly5Var2 = new ly5(romListActivity, null, 1);
                this.Y = 1;
                if (f04.v(vl0Var2, ly5Var2, this) == x61Var9) {
                    return x61Var9;
                }
                return jg7Var;
            case 9:
                x61 x61Var10 = x61.COROUTINE_SUSPENDED;
                int i16 = this.Y;
                if (i16 != 0) {
                    if (i16 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                tt3 tt3Var5 = tt3.STARTED;
                iy5 iy5Var5 = new iy5(romListActivity, null, 8);
                this.Y = 1;
                if (np2.d0(romListActivity, tt3Var5, iy5Var5, this) == x61Var10) {
                    return x61Var10;
                }
                return jg7Var;
            case 10:
                x61 x61Var11 = x61.COROUTINE_SUSPENDED;
                int i17 = this.Y;
                if (i17 != 0) {
                    if (i17 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                int i18 = RomListActivity.K0;
                de5 de5Var = romListActivity.C().s;
                jy5 jy5Var3 = new jy5(romListActivity, null, 2);
                this.Y = 1;
                if (f04.v(de5Var, jy5Var3, this) == x61Var11) {
                    return x61Var11;
                }
                return jg7Var;
            default:
                x61 x61Var12 = x61.COROUTINE_SUSPENDED;
                int i19 = this.Y;
                if (i19 != 0) {
                    if (i19 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                tt3 tt3Var6 = tt3.STARTED;
                iy5 iy5Var6 = new iy5(romListActivity, null, 10);
                this.Y = 1;
                if (np2.d0(romListActivity, tt3Var6, iy5Var6, this) == x61Var12) {
                    return x61Var12;
                }
                return jg7Var;
        }
    }
}
