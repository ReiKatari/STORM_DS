package defpackage;

import android.view.textclassifier.TextClassifier;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c0  reason: default package */
/* loaded from: classes.dex */
public final class c0 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public long Y;
    public int Z;
    public Object d0;
    public final /* synthetic */ Object e0;
    public final /* synthetic */ Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(q07 q07Var, long j, u07 u07Var, p07 p07Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 4;
        this.d0 = q07Var;
        this.Y = j;
        this.e0 = u07Var;
        this.f0 = p07Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((c0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 1:
                return ((c0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 2:
                return ((c0) q((r41) obj2, oc3.d(obj))).s(jg7Var);
            case 3:
                return ((c0) q((r41) obj2, (k86) obj)).s(jg7Var);
            case 4:
                return ((c0) q((r41) obj2, (w61) obj)).s(jg7Var);
            default:
                return ((c0) q((r41) obj2, (w61) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.f0;
        Object obj3 = this.e0;
        switch (i) {
            case 0:
                return new c0(0, this.Y, r41Var, (rc3) obj3, (r94) obj2);
            case 1:
                c0 c0Var = new c0((sz1) obj3, (pq5) obj2, r41Var);
                c0Var.d0 = obj;
                return c0Var;
            case 2:
                c0 c0Var2 = new c0(this.Y, r41Var, (zx4) obj3, (CharSequence) obj2);
                c0Var2.d0 = obj;
                return c0Var2;
            case 3:
                c0 c0Var3 = new c0(3, this.Y, r41Var, (m86) obj3, (ah5) obj2);
                c0Var3.d0 = obj;
                return c0Var3;
            case 4:
                return new c0((q07) this.d0, this.Y, (u07) obj3, (p07) obj2, r41Var);
            default:
                return new c0(5, this.Y, r41Var, (qa4) obj3, (r94) obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0228, code lost:
        if (r7.a(r1, r31) != r0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r7.a(r3, r31) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
        if (new defpackage.j27(r3.Z, r31, 0).s(r6) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0205, code lost:
        if (((defpackage.rc3) r5).c0(r31) == r0) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0149 -> B:74:0x014e). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        m25 m25Var;
        long currentTimeMillis;
        Object obj2;
        jg7 jg7Var;
        qa4 qa4Var;
        l25 l25Var;
        l25 l25Var2;
        int i = this.X;
        int i2 = 0;
        jg7 jg7Var2 = jg7.a;
        Object obj3 = this.e0;
        Object obj4 = this.f0;
        switch (i) {
            case 0:
                r94 r94Var = (r94) obj4;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i3 = this.Z;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                oi2.Y(obj);
                                return jg7Var2;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m25Var = (m25) this.d0;
                        oi2.Y(obj);
                        this.d0 = null;
                        this.Z = 3;
                        break;
                    } else {
                        oi2.Y(obj);
                    }
                } else {
                    oi2.Y(obj);
                    this.Z = 1;
                    break;
                }
                l25 l25Var3 = new l25(this.Y);
                m25 m25Var2 = new m25(l25Var3);
                this.d0 = m25Var2;
                this.Z = 2;
                if (r94Var.a(l25Var3, this) != x61Var) {
                    m25Var = m25Var2;
                    this.d0 = null;
                    this.Z = 3;
                }
                return x61Var;
            case 1:
                w61 w61Var = (w61) this.d0;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Z;
                if (i4 != 0) {
                    if (i4 == 1) {
                        currentTimeMillis = this.Y;
                        oi2.Y(obj);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        p06 p06Var = ((sz1) obj3).e;
                        pq5 pq5Var = (pq5) obj4;
                        jd1 jd1Var = oq1.B;
                        long M = n16.M(currentTimeMillis2 - currentTimeMillis, uq1.MILLISECONDS);
                        xb2 xb2Var = (xb2) p06Var;
                        xb2Var.getClass();
                        pq5Var.getClass();
                        CopyOnWriteArrayList copyOnWriteArrayList = xb2Var.m;
                        Iterator it = copyOnWriteArrayList.iterator();
                        int i5 = i2;
                        while (true) {
                            if (it.hasNext()) {
                                if (!((pq5) it.next()).b(pq5Var)) {
                                    i5++;
                                }
                            } else {
                                i5 = -1;
                            }
                        }
                        int i6 = i5;
                        if (i6 >= 0) {
                            obj2 = obj3;
                            jg7Var = jg7Var2;
                        } else {
                            pq5 pq5Var2 = (pq5) copyOnWriteArrayList.get(i6);
                            pq5Var2.getClass();
                            obj2 = obj3;
                            jg7Var = jg7Var2;
                            copyOnWriteArrayList.set(i6, pq5.a(pq5Var2, null, null, null, null, false, null, oq1.j(pq5Var2.j, M), false, null, 7679));
                            xb2Var.t(true);
                        }
                        currentTimeMillis = currentTimeMillis2;
                        obj3 = obj2;
                        jg7Var2 = jg7Var;
                        i2 = 0;
                        if (g04.H(w61Var)) {
                            this.d0 = w61Var;
                            this.Y = currentTimeMillis;
                            this.Z = 1;
                            if (q60.t(1000L, this) == x61Var2) {
                                return x61Var2;
                            }
                            long currentTimeMillis22 = System.currentTimeMillis();
                            p06 p06Var2 = ((sz1) obj3).e;
                            pq5 pq5Var3 = (pq5) obj4;
                            jd1 jd1Var2 = oq1.B;
                            long M2 = n16.M(currentTimeMillis22 - currentTimeMillis, uq1.MILLISECONDS);
                            xb2 xb2Var2 = (xb2) p06Var2;
                            xb2Var2.getClass();
                            pq5Var3.getClass();
                            CopyOnWriteArrayList copyOnWriteArrayList2 = xb2Var2.m;
                            Iterator it2 = copyOnWriteArrayList2.iterator();
                            int i52 = i2;
                            while (true) {
                                if (it2.hasNext()) {
                                }
                                i52++;
                            }
                            int i62 = i52;
                            if (i62 >= 0) {
                            }
                            currentTimeMillis = currentTimeMillis22;
                            obj3 = obj2;
                            jg7Var2 = jg7Var;
                            i2 = 0;
                            if (g04.H(w61Var)) {
                                return jg7Var2;
                            }
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    currentTimeMillis = System.currentTimeMillis();
                    if (g04.H(w61Var)) {
                    }
                }
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i7 = this.Z;
                if (i7 != 0) {
                    if (i7 == 1) {
                        oi2.Y(obj);
                        return jg7Var2;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                TextClassifier d = oc3.d(this.d0);
                long j = this.Y;
                this.Z = 1;
                if (zx4.a((zx4) obj3, (CharSequence) obj4, j, d, this) == x61Var3) {
                    return x61Var3;
                }
                return jg7Var2;
            case 3:
                m86 m86Var = (m86) obj3;
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i8 = this.Z;
                if (i8 != 0) {
                    if (i8 == 1) {
                        oi2.Y(obj);
                        return jg7Var2;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                float g = m86Var.g(this.Y);
                e46 e46Var = new e46((ah5) obj4, m86Var, (k86) this.d0, 1);
                this.Z = 1;
                if (kj2.l(RecyclerView.B1, g, null, e46Var, this, 12) == x61Var4) {
                    return x61Var4;
                }
                return jg7Var2;
            case 4:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i9 = this.Z;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            oi2.Y(obj);
                            return jg7Var2;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    j27 j27Var = ((q07) this.d0).m0;
                    if (j27Var != null) {
                        this.Z = 1;
                        break;
                    }
                }
                this.Z = 2;
                if (((u07) obj3).a((p07) obj4, this) != x61Var5) {
                    return jg7Var2;
                }
                return x61Var5;
            default:
                r94 r94Var2 = (r94) obj4;
                qa4 qa4Var2 = (qa4) obj3;
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                int i10 = this.Z;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            l25Var2 = (l25) this.d0;
                            oi2.Y(obj);
                            l25Var = l25Var2;
                            qa4Var2.setValue(l25Var);
                            return jg7Var2;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qa4Var = (qa4) this.d0;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    l25 l25Var4 = (l25) qa4Var2.getValue();
                    if (l25Var4 != null) {
                        k25 k25Var = new k25(l25Var4);
                        if (r94Var2 != null) {
                            this.d0 = qa4Var2;
                            this.Z = 1;
                            break;
                        }
                        qa4Var = qa4Var2;
                    }
                    l25Var = new l25(this.Y);
                    if (r94Var2 != null) {
                        this.d0 = l25Var;
                        this.Z = 2;
                        if (r94Var2.a(l25Var, this) != x61Var6) {
                            l25Var2 = l25Var;
                            l25Var = l25Var2;
                        }
                        return x61Var6;
                    }
                    qa4Var2.setValue(l25Var);
                    return jg7Var2;
                }
                qa4Var.setValue(null);
                l25Var = new l25(this.Y);
                if (r94Var2 != null) {
                }
                qa4Var2.setValue(l25Var);
                return jg7Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(long j, r41 r41Var, zx4 zx4Var, CharSequence charSequence) {
        super(2, r41Var);
        this.X = 2;
        this.e0 = zx4Var;
        this.f0 = charSequence;
        this.Y = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(sz1 sz1Var, pq5 pq5Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 1;
        this.e0 = sz1Var;
        this.f0 = pq5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i, long j, r41 r41Var, Object obj, Object obj2) {
        super(2, r41Var);
        this.X = i;
        this.e0 = obj;
        this.Y = j;
        this.f0 = obj2;
    }
}
