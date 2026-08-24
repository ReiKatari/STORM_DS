package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vm5  reason: default package */
/* loaded from: classes.dex */
public abstract class vm5 {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
        if (r7.h(r4, r0) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
        if (r11.k(r4, r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0119, code lost:
        if (r8.D(r7, r0) != r1) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object F(vm5 vm5Var, ea5 ea5Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, s41 s41Var) {
        sm5 sm5Var;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        vm5 vm5Var2;
        List list;
        ea5 ea5Var2;
        List list2;
        List list3;
        List list4;
        ea5 ea5Var3;
        vm5 vm5Var3;
        ea5 ea5Var4;
        vm5 vm5Var4;
        ea5 ea5Var5;
        vm5 vm5Var5;
        if (s41Var instanceof sm5) {
            sm5Var = (sm5) s41Var;
            int i = sm5Var.g0;
            if ((i & Integer.MIN_VALUE) != 0) {
                sm5Var.g0 = i - Integer.MIN_VALUE;
                Object obj = sm5Var.e0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                switch (sm5Var.g0) {
                    case 0:
                        oi2.Y(obj);
                        long j = ea5Var.a;
                        sm5Var.R = vm5Var;
                        sm5Var.X = ea5Var;
                        sm5Var.Y = arrayList;
                        sm5Var.Z = arrayList2;
                        sm5Var.d0 = arrayList3;
                        sm5Var.g0 = 1;
                        arrayList6 = arrayList;
                        arrayList5 = arrayList2;
                        arrayList4 = arrayList3;
                        break;
                    case 1:
                        List list5 = sm5Var.d0;
                        List list6 = sm5Var.Z;
                        List list7 = sm5Var.Y;
                        ea5Var = sm5Var.X;
                        vm5Var = sm5Var.R;
                        oi2.Y(obj);
                        arrayList6 = list7;
                        arrayList5 = list6;
                        arrayList4 = list5;
                        long j2 = ea5Var.a;
                        sm5Var.R = vm5Var;
                        sm5Var.X = ea5Var;
                        sm5Var.Y = arrayList6;
                        sm5Var.Z = arrayList5;
                        sm5Var.d0 = arrayList4;
                        sm5Var.g0 = 2;
                        if (vm5Var.j(j2, sm5Var) != x61Var) {
                            List list8 = arrayList4;
                            vm5Var2 = vm5Var;
                            list = list8;
                            List list9 = arrayList5;
                            ea5Var2 = ea5Var;
                            list2 = list9;
                            list3 = arrayList6;
                            long j3 = ea5Var2.a;
                            sm5Var.R = vm5Var2;
                            sm5Var.X = ea5Var2;
                            sm5Var.Y = list3;
                            sm5Var.Z = list2;
                            sm5Var.d0 = list;
                            sm5Var.g0 = 3;
                            list4 = list3;
                            break;
                        }
                        return x61Var;
                    case 2:
                        list = sm5Var.d0;
                        list2 = sm5Var.Z;
                        List list10 = sm5Var.Y;
                        ea5Var2 = sm5Var.X;
                        vm5Var2 = sm5Var.R;
                        oi2.Y(obj);
                        list3 = list10;
                        long j32 = ea5Var2.a;
                        sm5Var.R = vm5Var2;
                        sm5Var.X = ea5Var2;
                        sm5Var.Y = list3;
                        sm5Var.Z = list2;
                        sm5Var.d0 = list;
                        sm5Var.g0 = 3;
                        list4 = list3;
                        break;
                    case 3:
                        list = sm5Var.d0;
                        list2 = sm5Var.Z;
                        List list11 = sm5Var.Y;
                        ea5Var2 = sm5Var.X;
                        vm5Var2 = sm5Var.R;
                        oi2.Y(obj);
                        list4 = list11;
                        sm5Var.R = vm5Var2;
                        sm5Var.X = ea5Var2;
                        sm5Var.Y = null;
                        sm5Var.Z = list2;
                        sm5Var.d0 = list;
                        sm5Var.g0 = 4;
                        if (vm5Var2.y(list4, sm5Var) != x61Var) {
                            ea5Var3 = ea5Var2;
                            vm5Var3 = vm5Var2;
                            sm5Var.R = vm5Var3;
                            sm5Var.X = ea5Var3;
                            sm5Var.Y = null;
                            sm5Var.Z = null;
                            sm5Var.d0 = list;
                            sm5Var.g0 = 5;
                            if (vm5Var3.v(list2, sm5Var) != x61Var) {
                                ea5Var4 = ea5Var3;
                                vm5Var4 = vm5Var3;
                                sm5Var.R = vm5Var4;
                                sm5Var.X = ea5Var4;
                                sm5Var.Y = null;
                                sm5Var.Z = null;
                                sm5Var.d0 = null;
                                sm5Var.g0 = 6;
                                if (vm5Var4.x(list, sm5Var) != x61Var) {
                                    ea5Var5 = ea5Var4;
                                    vm5Var5 = vm5Var4;
                                    sm5Var.R = null;
                                    sm5Var.X = null;
                                    sm5Var.Y = null;
                                    sm5Var.Z = null;
                                    sm5Var.d0 = null;
                                    sm5Var.g0 = 7;
                                    break;
                                }
                            }
                        }
                        return x61Var;
                    case 4:
                        list = sm5Var.d0;
                        list2 = sm5Var.Z;
                        ea5Var3 = sm5Var.X;
                        vm5Var3 = sm5Var.R;
                        oi2.Y(obj);
                        sm5Var.R = vm5Var3;
                        sm5Var.X = ea5Var3;
                        sm5Var.Y = null;
                        sm5Var.Z = null;
                        sm5Var.d0 = list;
                        sm5Var.g0 = 5;
                        if (vm5Var3.v(list2, sm5Var) != x61Var) {
                        }
                        return x61Var;
                    case 5:
                        list = sm5Var.d0;
                        ea5Var4 = sm5Var.X;
                        vm5Var4 = sm5Var.R;
                        oi2.Y(obj);
                        sm5Var.R = vm5Var4;
                        sm5Var.X = ea5Var4;
                        sm5Var.Y = null;
                        sm5Var.Z = null;
                        sm5Var.d0 = null;
                        sm5Var.g0 = 6;
                        if (vm5Var4.x(list, sm5Var) != x61Var) {
                        }
                        return x61Var;
                    case 6:
                        ea5Var5 = sm5Var.X;
                        vm5Var5 = sm5Var.R;
                        oi2.Y(obj);
                        sm5Var.R = null;
                        sm5Var.X = null;
                        sm5Var.Y = null;
                        sm5Var.Z = null;
                        sm5Var.d0 = null;
                        sm5Var.g0 = 7;
                        break;
                    case 7:
                        oi2.Y(obj);
                        return jg7.a;
                    default:
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        sm5Var = new sm5(vm5Var, s41Var);
        Object obj2 = sm5Var.e0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        switch (sm5Var.g0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r6.i(r0) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r6.w(r7, r0) != r1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object H(vm5 vm5Var, ArrayList arrayList, s41 s41Var) {
        tm5 tm5Var;
        int i;
        if (s41Var instanceof tm5) {
            tm5Var = (tm5) s41Var;
            int i2 = tm5Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tm5Var.d0 = i2 - Integer.MIN_VALUE;
                Object obj = tm5Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = tm5Var.d0;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = tm5Var.X;
                    vm5Var = tm5Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    tm5Var.R = vm5Var;
                    tm5Var.X = arrayList;
                    tm5Var.d0 = 1;
                }
                tm5Var.R = null;
                tm5Var.X = null;
                tm5Var.d0 = 2;
            }
        }
        tm5Var = new tm5(vm5Var, s41Var);
        Object obj2 = tm5Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = tm5Var.d0;
        if (i == 0) {
        }
        tm5Var.R = null;
        tm5Var.X = null;
        tm5Var.d0 = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r6.l(r7, r0) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r6.z(r9, r0) != r1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object J(vm5 vm5Var, long j, ArrayList arrayList, s41 s41Var) {
        um5 um5Var;
        int i;
        if (s41Var instanceof um5) {
            um5Var = (um5) s41Var;
            int i2 = um5Var.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                um5Var.e0 = i2 - Integer.MIN_VALUE;
                Object obj = um5Var.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = um5Var.e0;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = um5Var.Y;
                    arrayList = um5Var.X;
                    vm5Var = um5Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    um5Var.R = vm5Var;
                    um5Var.X = arrayList;
                    um5Var.Y = j;
                    um5Var.e0 = 1;
                }
                um5Var.R = null;
                um5Var.X = null;
                um5Var.Y = j;
                um5Var.e0 = 2;
            }
        }
        um5Var = new um5(vm5Var, s41Var);
        Object obj2 = um5Var.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = um5Var.e0;
        if (i == 0) {
        }
        um5Var.R = null;
        um5Var.X = null;
        um5Var.Y = j;
        um5Var.e0 = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r7.c(r0) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
        if (r7.g(r0) != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        if (r7.f(r0) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object e(vm5 vm5Var, s41 s41Var) {
        rm5 rm5Var;
        int i;
        if (s41Var instanceof rm5) {
            rm5Var = (rm5) s41Var;
            int i2 = rm5Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rm5Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = rm5Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = rm5Var.Z;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                oi2.Y(obj);
                                return jg7.a;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vm5Var = rm5Var.R;
                        oi2.Y(obj);
                        rm5Var.R = null;
                        rm5Var.Z = 3;
                    } else {
                        vm5Var = rm5Var.R;
                        oi2.Y(obj);
                    }
                } else {
                    oi2.Y(obj);
                    rm5Var.R = vm5Var;
                    rm5Var.Z = 1;
                }
                rm5Var.R = vm5Var;
                rm5Var.Z = 2;
            }
        }
        rm5Var = new rm5(vm5Var, s41Var);
        Object obj2 = rm5Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = rm5Var.Z;
        if (i == 0) {
        }
        rm5Var.R = vm5Var;
        rm5Var.Z = 2;
    }

    public abstract le2 A();

    public abstract le2 B();

    public abstract Object C(ab5 ab5Var, ol olVar);

    public abstract Object D(ea5 ea5Var, sm5 sm5Var);

    public abstract Object E(ea5 ea5Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, pk pkVar);

    public abstract Object G(ArrayList arrayList, uk ukVar);

    public abstract Object I(long j, ArrayList arrayList, qk qkVar);

    public abstract Object a(ab5 ab5Var, ll llVar);

    public abstract Object b(fb5 fb5Var, s41 s41Var);

    public abstract Object c(rm5 rm5Var);

    public abstract Object d(s41 s41Var);

    public abstract Object f(rm5 rm5Var);

    public abstract Object g(rm5 rm5Var);

    public abstract Object h(long j, sm5 sm5Var);

    public abstract Object i(tm5 tm5Var);

    public abstract Object j(long j, sm5 sm5Var);

    public abstract Object k(long j, sm5 sm5Var);

    public abstract Object l(long j, um5 um5Var);

    public abstract Object m(long j, rk rkVar);

    public abstract Object n(long j, sk skVar);

    public abstract Object o(long j, s41 s41Var);

    public abstract Object p(long j, wk wkVar);

    public abstract Object q(String str, s41 s41Var);

    public abstract Object r(long j, boolean z, s41 s41Var);

    public abstract Object s(long j, s41 s41Var);

    public abstract Object t(long j, s41 s41Var);

    public abstract Object u(ol olVar);

    public abstract Object v(List list, sm5 sm5Var);

    public abstract Object w(List list, tm5 tm5Var);

    public abstract Object x(List list, sm5 sm5Var);

    public abstract Object y(List list, sm5 sm5Var);

    public abstract Object z(List list, um5 um5Var);
}
