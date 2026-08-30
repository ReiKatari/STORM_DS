package v0;

import a4.n;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import fj.j;
import j0.b0;
import j0.d0;
import j0.l2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static final double f13577h = Math.sqrt(2.3703703703703702d);

    /* renamed from: a  reason: collision with root package name */
    public final Size f13578a;

    /* renamed from: b  reason: collision with root package name */
    public final Rational f13579b;

    /* renamed from: c  reason: collision with root package name */
    public final Rational f13580c;

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f13581d;

    /* renamed from: e  reason: collision with root package name */
    public final n f13582e;

    /* renamed from: f  reason: collision with root package name */
    public final b0 f13583f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f13584g;

    public b(d0 d0Var, HashSet hashSet) {
        Rational rational;
        Size f8 = k0.h.f(d0Var.k().k());
        b0 k10 = d0Var.k();
        n nVar = new n(k10, f8);
        this.f13584g = new HashMap();
        this.f13578a = f8;
        if (f8.getWidth() / f8.getHeight() > f13577h) {
            rational = k0.b.f7940c;
        } else {
            rational = k0.b.f7938a;
        }
        aj.g.o("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + f8 + ") is " + rational + ".");
        this.f13579b = rational;
        Rational rational2 = k0.b.f7938a;
        if (rational.equals(rational2)) {
            rational2 = k0.b.f7940c;
        } else if (!rational.equals(k0.b.f7940c)) {
            j.r(rational, "Invalid sensor aspect-ratio: ");
            throw null;
        }
        this.f13580c = rational2;
        this.f13583f = k10;
        this.f13581d = hashSet;
        this.f13582e = nVar;
    }

    public static Rect a(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational h2 = h(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational h10 = h(size);
        if (h2.floatValue() == h10.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (h2.floatValue() > h10.floatValue()) {
                float f8 = width;
                float floatValue = f8 / h2.floatValue();
                float f10 = (height - floatValue) / 2.0f;
                rectF = new RectF(0.0f, f10, f8, floatValue + f10);
            } else {
                float f11 = height;
                float floatValue2 = h2.floatValue() * f11;
                float f12 = (width - floatValue2) / 2.0f;
                rectF = new RectF(f12, 0.0f, floatValue2 + f12, f11);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static boolean d(Size size, Size size2) {
        if (size.getHeight() <= size2.getHeight() && size.getWidth() <= size2.getWidth()) {
            return false;
        }
        return true;
    }

    public static Rational h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final a b(l2 l2Var, Rect rect, int i2, boolean z10) {
        boolean z11;
        Size size;
        Size size2;
        Pair create;
        if (k0.h.c(i2)) {
            z11 = true;
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        } else {
            z11 = false;
        }
        if (z10) {
            Size f8 = k0.h.f(rect);
            Iterator it = c(l2Var).iterator();
            while (true) {
                if (it.hasNext()) {
                    Size size3 = (Size) it.next();
                    Size f10 = k0.h.f(a(size3, f8));
                    if (!d(f10, f8)) {
                        create = Pair.create(size3, f10);
                        break;
                    }
                } else {
                    create = Pair.create(f8, f8);
                    break;
                }
            }
            size = (Size) create.first;
            size2 = (Size) create.second;
        } else {
            Size f11 = k0.h.f(rect);
            List c4 = c(l2Var);
            Iterator it2 = c4.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Size size4 = (Size) it2.next();
                    Rational rational = k0.b.f7938a;
                    if (!k0.b.a(rational, f11)) {
                        rational = k0.b.f7940c;
                        if (!k0.b.a(rational, f11)) {
                            rational = h(f11);
                        }
                    }
                    if (!e(rational, size4) && !d(size4, f11)) {
                        size = size4;
                        break;
                    }
                } else {
                    Iterator it3 = c4.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            size = (Size) it3.next();
                            if (!d(size, f11)) {
                                break;
                            }
                        } else {
                            size = f11;
                            break;
                        }
                    }
                }
            }
            rect = a(f11, size);
            size2 = size;
        }
        a aVar = new a(rect, size2, size);
        if (z11) {
            return new a(new Rect(rect.top, rect.left, rect.bottom, rect.right), new Size(size2.getHeight(), size2.getWidth()), size);
        }
        return aVar;
    }

    public final List c(l2 l2Var) {
        Rational rational;
        if (this.f13581d.contains(l2Var)) {
            HashMap hashMap = this.f13584g;
            if (hashMap.containsKey(l2Var)) {
                List list = (List) hashMap.get(l2Var);
                Objects.requireNonNull(list);
                return list;
            }
            ArrayList u4 = this.f13582e.u(l2Var);
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            int size = u4.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = u4.get(i2);
                i2++;
                Size size2 = (Size) obj;
                Iterator it = hashMap2.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        rational = (Rational) it.next();
                        if (k0.b.a(rational, size2)) {
                            break;
                        }
                    } else {
                        rational = null;
                        break;
                    }
                }
                if (rational != null) {
                    Size size3 = (Size) hashMap2.get(rational);
                    Objects.requireNonNull(size3);
                    if (size2.getHeight() <= size3.getHeight()) {
                        if (size2.getWidth() <= size3.getWidth()) {
                            if (size2.getWidth() == size3.getWidth() && size2.getHeight() == size3.getHeight()) {
                            }
                        }
                    }
                } else {
                    rational = h(size2);
                }
                arrayList.add(size2);
                hashMap2.put(rational, size2);
            }
            hashMap.put(l2Var, arrayList);
            return arrayList;
        }
        j.r(l2Var, "Invalid child config: ");
        return null;
    }

    public final boolean e(Rational rational, Size size) {
        int i2;
        Rational rational2 = this.f13579b;
        if (!rational2.equals(rational) && !k0.b.a(rational, size)) {
            float floatValue = rational2.floatValue();
            float floatValue2 = rational.floatValue();
            Rational rational3 = k0.b.f7938a;
            if (!k0.b.a(rational3, size)) {
                rational3 = k0.b.f7940c;
                if (!k0.b.a(rational3, size)) {
                    rational3 = h(size);
                }
            }
            float floatValue3 = rational3.floatValue();
            int i10 = (floatValue > floatValue2 ? 1 : (floatValue == floatValue2 ? 0 : -1));
            if (i10 != 0 && floatValue2 != floatValue3) {
                if (i10 > 0) {
                    if (floatValue2 < floatValue3) {
                        return true;
                    }
                    return false;
                } else if (i2 > 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public final ArrayList f(List list, boolean z10) {
        int i2;
        List list2;
        HashMap hashMap = new HashMap();
        Rational rational = k0.b.f7938a;
        hashMap.put(rational, new ArrayList());
        Rational rational2 = k0.b.f7940c;
        hashMap.put(rational2, new ArrayList());
        ArrayList arrayList = new ArrayList();
        arrayList.add(rational);
        arrayList.add(rational2);
        Iterator it = list.iterator();
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                int size2 = arrayList.size();
                while (true) {
                    if (i2 < size2) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        Rational rational3 = (Rational) obj;
                        if (k0.b.a(rational3, size)) {
                            list2 = (List) hashMap.get(rational3);
                            break;
                        }
                    } else {
                        list2 = null;
                        break;
                    }
                }
                if (list2 == null) {
                    list2 = new ArrayList();
                    Rational h2 = h(size);
                    arrayList.add(h2);
                    hashMap.put(h2, list2);
                }
                list2.add(size);
            }
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2, new ah.d0(3, h(this.f13578a)));
        ArrayList arrayList3 = new ArrayList();
        int size3 = arrayList2.size();
        while (i2 < size3) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            Rational rational4 = (Rational) obj2;
            if (!rational4.equals(k0.b.f7940c) && !rational4.equals(k0.b.f7938a)) {
                List list3 = (List) hashMap.get(rational4);
                Objects.requireNonNull(list3);
                arrayList3.addAll(g(rational4, list3, z10));
            }
        }
        return arrayList3;
    }

    public final ArrayList g(Rational rational, List list, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (k0.b.a(rational, size)) {
                arrayList3.add(size);
            }
        }
        Collections.sort(arrayList3, new k0.c(true));
        HashSet hashSet = new HashSet(arrayList3);
        Iterator it2 = this.f13581d.iterator();
        while (true) {
            int i2 = 0;
            if (it2.hasNext()) {
                List<Size> c4 = c((l2) it2.next());
                if (!z10) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Size size2 : c4) {
                        if (!e(rational, size2)) {
                            arrayList4.add(size2);
                        }
                    }
                    c4 = arrayList4;
                }
                if (c4.isEmpty()) {
                    return new ArrayList();
                }
                if (!c4.isEmpty() && !arrayList3.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    int size3 = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size3) {
                        Object obj = arrayList3.get(i10);
                        i10++;
                        Size size4 = (Size) obj;
                        Iterator it3 = c4.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (!d((Size) it3.next(), size4)) {
                                    arrayList5.add(size4);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    arrayList3 = arrayList5;
                } else {
                    arrayList3 = new ArrayList();
                }
                if (!c4.isEmpty() && !arrayList3.isEmpty()) {
                    if (arrayList3.isEmpty()) {
                        arrayList2 = arrayList3;
                    } else {
                        arrayList2 = new ArrayList(new LinkedHashSet(arrayList3));
                    }
                    arrayList = new ArrayList();
                    int size5 = arrayList2.size();
                    while (i2 < size5) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        Size size6 = (Size) obj2;
                        Iterator it4 = c4.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (d((Size) it4.next(), size6)) {
                                    break;
                                }
                            } else {
                                arrayList.add(size6);
                                break;
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                } else {
                    arrayList = new ArrayList();
                }
                hashSet.retainAll(arrayList);
            } else {
                ArrayList arrayList6 = new ArrayList();
                int size7 = arrayList3.size();
                while (i2 < size7) {
                    Object obj3 = arrayList3.get(i2);
                    i2++;
                    Size size8 = (Size) obj3;
                    if (!hashSet.contains(size8)) {
                        arrayList6.add(size8);
                    }
                }
                return arrayList6;
            }
        }
    }
}
