package wa;

import ah.b0;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends AbstractMap implements Serializable {

    /* renamed from: c0  reason: collision with root package name */
    public static final b0 f14185c0 = new b0(15);
    public final boolean B;
    public n L;
    public final n Y;
    public m Z;

    /* renamed from: b0  reason: collision with root package name */
    public m f14186b0;
    public int R = 0;
    public int X = 0;
    public final Comparator A = f14185c0;

    public o(boolean z10) {
        this.B = z10;
        this.Y = new n(z10);
    }

    public final n a(boolean z10, Object obj) {
        int i2;
        n nVar;
        Comparable comparable;
        n nVar2;
        n nVar3 = this.L;
        b0 b0Var = f14185c0;
        Comparator comparator = this.A;
        if (nVar3 != null) {
            if (comparator == b0Var) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = nVar3.Y;
                if (comparable != null) {
                    i2 = comparable.compareTo(obj2);
                } else {
                    i2 = comparator.compare(obj, obj2);
                }
                if (i2 == 0) {
                    return nVar3;
                }
                if (i2 < 0) {
                    nVar2 = nVar3.B;
                } else {
                    nVar2 = nVar3.L;
                }
                if (nVar2 == null) {
                    break;
                }
                nVar3 = nVar2;
            }
        } else {
            i2 = 0;
        }
        n nVar4 = nVar3;
        if (!z10) {
            return null;
        }
        n nVar5 = this.Y;
        if (nVar4 == null) {
            if (comparator == b0Var && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            nVar = new n(this.B, nVar4, obj, nVar5, nVar5.X);
            this.L = nVar;
        } else {
            nVar = new n(this.B, nVar4, obj, nVar5, nVar5.X);
            if (i2 < 0) {
                nVar4.B = nVar;
            } else {
                nVar4.L = nVar;
            }
            b(nVar4, true);
        }
        this.R++;
        this.X++;
        return nVar;
    }

    public final void b(n nVar, boolean z10) {
        int i2;
        int i10;
        int i11;
        int i12;
        while (nVar != null) {
            n nVar2 = nVar.B;
            n nVar3 = nVar.L;
            int i13 = 0;
            if (nVar2 != null) {
                i2 = nVar2.f14184c0;
            } else {
                i2 = 0;
            }
            if (nVar3 != null) {
                i10 = nVar3.f14184c0;
            } else {
                i10 = 0;
            }
            int i14 = i2 - i10;
            if (i14 == -2) {
                n nVar4 = nVar3.B;
                n nVar5 = nVar3.L;
                if (nVar5 != null) {
                    i12 = nVar5.f14184c0;
                } else {
                    i12 = 0;
                }
                if (nVar4 != null) {
                    i13 = nVar4.f14184c0;
                }
                int i15 = i13 - i12;
                if (i15 != -1 && (i15 != 0 || z10)) {
                    f(nVar3);
                    e(nVar);
                } else {
                    e(nVar);
                }
                if (z10) {
                    return;
                }
            } else if (i14 == 2) {
                n nVar6 = nVar2.B;
                n nVar7 = nVar2.L;
                if (nVar7 != null) {
                    i11 = nVar7.f14184c0;
                } else {
                    i11 = 0;
                }
                if (nVar6 != null) {
                    i13 = nVar6.f14184c0;
                }
                int i16 = i13 - i11;
                if (i16 != 1 && (i16 != 0 || z10)) {
                    e(nVar2);
                    f(nVar);
                } else {
                    f(nVar);
                }
                if (z10) {
                    return;
                }
            } else if (i14 == 0) {
                nVar.f14184c0 = i2 + 1;
                if (z10) {
                    return;
                }
            } else {
                nVar.f14184c0 = Math.max(i2, i10) + 1;
                if (!z10) {
                    return;
                }
            }
            nVar = nVar.A;
        }
    }

    public final void c(n nVar, boolean z10) {
        n nVar2;
        n nVar3;
        int i2;
        if (z10) {
            n nVar4 = nVar.X;
            nVar4.R = nVar.R;
            nVar.R.X = nVar4;
        }
        n nVar5 = nVar.B;
        n nVar6 = nVar.L;
        n nVar7 = nVar.A;
        int i10 = 0;
        if (nVar5 != null && nVar6 != null) {
            if (nVar5.f14184c0 > nVar6.f14184c0) {
                n nVar8 = nVar5.L;
                while (true) {
                    n nVar9 = nVar8;
                    nVar3 = nVar5;
                    nVar5 = nVar9;
                    if (nVar5 == null) {
                        break;
                    }
                    nVar8 = nVar5.L;
                }
            } else {
                n nVar10 = nVar6.B;
                while (true) {
                    nVar2 = nVar6;
                    nVar6 = nVar10;
                    if (nVar6 == null) {
                        break;
                    }
                    nVar10 = nVar6.B;
                }
                nVar3 = nVar2;
            }
            c(nVar3, false);
            n nVar11 = nVar.B;
            if (nVar11 != null) {
                i2 = nVar11.f14184c0;
                nVar3.B = nVar11;
                nVar11.A = nVar3;
                nVar.B = null;
            } else {
                i2 = 0;
            }
            n nVar12 = nVar.L;
            if (nVar12 != null) {
                i10 = nVar12.f14184c0;
                nVar3.L = nVar12;
                nVar12.A = nVar3;
                nVar.L = null;
            }
            nVar3.f14184c0 = Math.max(i2, i10) + 1;
            d(nVar, nVar3);
            return;
        }
        if (nVar5 != null) {
            d(nVar, nVar5);
            nVar.B = null;
        } else if (nVar6 != null) {
            d(nVar, nVar6);
            nVar.L = null;
        } else {
            d(nVar, null);
        }
        b(nVar7, false);
        this.R--;
        this.X++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.L = null;
        this.R = 0;
        this.X++;
        n nVar = this.Y;
        nVar.X = nVar;
        nVar.R = nVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        n nVar = null;
        if (obj != null) {
            try {
                nVar = a(false, obj);
            } catch (ClassCastException unused) {
            }
        }
        if (nVar == null) {
            return false;
        }
        return true;
    }

    public final void d(n nVar, n nVar2) {
        n nVar3 = nVar.A;
        nVar.A = null;
        if (nVar2 != null) {
            nVar2.A = nVar3;
        }
        if (nVar3 != null) {
            if (nVar3.B == nVar) {
                nVar3.B = nVar2;
                return;
            } else {
                nVar3.L = nVar2;
                return;
            }
        }
        this.L = nVar2;
    }

    public final void e(n nVar) {
        int i2;
        int i10;
        n nVar2 = nVar.B;
        n nVar3 = nVar.L;
        n nVar4 = nVar3.B;
        n nVar5 = nVar3.L;
        nVar.L = nVar4;
        if (nVar4 != null) {
            nVar4.A = nVar;
        }
        d(nVar, nVar3);
        nVar3.B = nVar;
        nVar.A = nVar3;
        int i11 = 0;
        if (nVar2 != null) {
            i2 = nVar2.f14184c0;
        } else {
            i2 = 0;
        }
        if (nVar4 != null) {
            i10 = nVar4.f14184c0;
        } else {
            i10 = 0;
        }
        int max = Math.max(i2, i10) + 1;
        nVar.f14184c0 = max;
        if (nVar5 != null) {
            i11 = nVar5.f14184c0;
        }
        nVar3.f14184c0 = Math.max(max, i11) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        m mVar = this.Z;
        if (mVar == null) {
            m mVar2 = new m(0, this);
            this.Z = mVar2;
            return mVar2;
        }
        return mVar;
    }

    public final void f(n nVar) {
        int i2;
        int i10;
        n nVar2 = nVar.B;
        n nVar3 = nVar.L;
        n nVar4 = nVar2.B;
        n nVar5 = nVar2.L;
        nVar.B = nVar5;
        if (nVar5 != null) {
            nVar5.A = nVar;
        }
        d(nVar, nVar2);
        nVar2.L = nVar;
        nVar.A = nVar2;
        int i11 = 0;
        if (nVar3 != null) {
            i2 = nVar3.f14184c0;
        } else {
            i2 = 0;
        }
        if (nVar5 != null) {
            i10 = nVar5.f14184c0;
        } else {
            i10 = 0;
        }
        int max = Math.max(i2, i10) + 1;
        nVar.f14184c0 = max;
        if (nVar4 != null) {
            i11 = nVar4.f14184c0;
        }
        nVar2.f14184c0 = Math.max(max, i11) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            wa.n r3 = r2.a(r1, r3)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Lf
            java.lang.Object r3 = r3.f14183b0
            return r3
        Lf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.o.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        m mVar = this.f14186b0;
        if (mVar == null) {
            m mVar2 = new m(1, this);
            this.f14186b0 = mVar2;
            return mVar2;
        }
        return mVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.B) {
                m9.o.i("value == null");
                return null;
            }
            n a10 = a(true, obj);
            Object obj3 = a10.f14183b0;
            a10.f14183b0 = obj2;
            return obj3;
        }
        m9.o.i("key == null");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            wa.n r3 = r2.a(r1, r3)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.c(r3, r1)
        L10:
            if (r3 == 0) goto L15
            java.lang.Object r3 = r3.f14183b0
            return r3
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.o.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.R;
    }
}
