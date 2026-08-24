package defpackage;

import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vk3  reason: default package */
/* loaded from: classes.dex */
public final class vk3 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ LayoutEditorActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk3(LayoutEditorActivity layoutEditorActivity, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = layoutEditorActivity;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((vk3) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((vk3) q(r41Var, w61Var)).s(jg7Var);
            case 2:
                return ((vk3) q(r41Var, w61Var)).s(jg7Var);
            case 3:
                return ((vk3) q(r41Var, w61Var)).s(jg7Var);
            case 4:
                return ((vk3) q(r41Var, w61Var)).s(jg7Var);
            case 5:
                return ((vk3) q(r41Var, w61Var)).s(jg7Var);
            case 6:
                return ((vk3) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((vk3) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        LayoutEditorActivity layoutEditorActivity = this.Z;
        switch (i) {
            case 0:
                return new vk3(layoutEditorActivity, r41Var, 0);
            case 1:
                return new vk3(layoutEditorActivity, r41Var, 1);
            case 2:
                return new vk3(layoutEditorActivity, r41Var, 2);
            case 3:
                return new vk3(layoutEditorActivity, r41Var, 3);
            case 4:
                return new vk3(layoutEditorActivity, r41Var, 4);
            case 5:
                return new vk3(layoutEditorActivity, r41Var, 5);
            case 6:
                return new vk3(layoutEditorActivity, r41Var, 6);
            default:
                return new vk3(layoutEditorActivity, r41Var, 7);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        LayoutEditorActivity layoutEditorActivity = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 != 1) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    int i3 = LayoutEditorActivity.N0;
                    de5 de5Var = layoutEditorActivity.C().p;
                    uk3 uk3Var = new uk3(layoutEditorActivity, 0);
                    this.Y = 1;
                    if (de5Var.A.b(uk3Var, this) == x61Var) {
                        return x61Var;
                    }
                }
                e41.c();
                return null;
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
                ku3 ku3Var = layoutEditorActivity.A;
                tt3 tt3Var = tt3.STARTED;
                vk3 vk3Var = new vk3(layoutEditorActivity, null, 0);
                this.Y = 1;
                if (np2.c0(ku3Var, tt3Var, vk3Var, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 != 1) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    int i6 = LayoutEditorActivity.N0;
                    de5 de5Var2 = layoutEditorActivity.C().l;
                    uk3 uk3Var2 = new uk3(layoutEditorActivity, 1);
                    this.Y = 1;
                    if (de5Var2.A.b(uk3Var2, this) == x61Var3) {
                        return x61Var3;
                    }
                }
                e41.c();
                return null;
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
                ku3 ku3Var2 = layoutEditorActivity.A;
                tt3 tt3Var2 = tt3.STARTED;
                vk3 vk3Var2 = new vk3(layoutEditorActivity, null, 2);
                this.Y = 1;
                if (np2.c0(ku3Var2, tt3Var2, vk3Var2, this) == x61Var4) {
                    return x61Var4;
                }
                return jg7Var;
            case 4:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i8 = this.Y;
                if (i8 != 0) {
                    if (i8 != 1) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    int i9 = LayoutEditorActivity.N0;
                    de5 de5Var3 = layoutEditorActivity.C().n;
                    uk3 uk3Var3 = new uk3(layoutEditorActivity, 2);
                    this.Y = 1;
                    if (de5Var3.A.b(uk3Var3, this) == x61Var5) {
                        return x61Var5;
                    }
                }
                e41.c();
                return null;
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
                ku3 ku3Var3 = layoutEditorActivity.A;
                tt3 tt3Var3 = tt3.STARTED;
                vk3 vk3Var3 = new vk3(layoutEditorActivity, null, 4);
                this.Y = 1;
                if (np2.c0(ku3Var3, tt3Var3, vk3Var3, this) == x61Var6) {
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
                rt7.c0.getClass();
                pb0 p = f04.p(new vy5(qt7.a(layoutEditorActivity), layoutEditorActivity, (r41) null, 19));
                xe1 xe1Var = xk1.a;
                le2 E = f04.E(p, e04.a);
                uk3 uk3Var4 = new uk3(layoutEditorActivity, 3);
                this.Y = 1;
                if (E.b(uk3Var4, this) == x61Var7) {
                    return x61Var7;
                }
                return jg7Var;
            default:
                x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                int i12 = this.Y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ku3 ku3Var4 = layoutEditorActivity.A;
                tt3 tt3Var4 = tt3.STARTED;
                vk3 vk3Var4 = new vk3(layoutEditorActivity, null, 6);
                this.Y = 1;
                if (np2.c0(ku3Var4, tt3Var4, vk3Var4, this) == x61Var8) {
                    return x61Var8;
                }
                return jg7Var;
        }
    }
}
