package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ob5  reason: default package */
/* loaded from: classes.dex */
public final class ob5 {
    public static final double h = Math.sqrt(2.3703703703703702d);
    public final Size a;
    public final Rational b;
    public final Rational c;
    public final HashSet d;
    public final n85 e;
    public final td0 f;
    public final HashMap g;

    public ob5(vd0 vd0Var, HashSet hashSet) {
        Rational rational;
        Size f = tw6.f(vd0Var.l().n());
        td0 l = vd0Var.l();
        n85 n85Var = new n85(l, f);
        this.g = new HashMap();
        this.a = f;
        if (f.getWidth() / f.getHeight() > h) {
            rational = uu.c;
        } else {
            rational = uu.a;
        }
        ve2.v("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + f + ") is " + rational + ".");
        this.b = rational;
        Rational rational2 = uu.a;
        if (rational.equals(rational2)) {
            rational2 = uu.c;
        } else if (!rational.equals(uu.c)) {
            f81.x(rational, "Invalid sensor aspect-ratio: ");
            throw null;
        }
        this.c = rational2;
        this.f = l;
        this.d = hashSet;
        this.e = n85Var;
    }

    public static Rect a(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational h2 = h(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational h3 = h(size);
        if (h2.floatValue() == h3.floatValue()) {
            rectF2 = new RectF(RecyclerView.A1, RecyclerView.A1, width, height);
        } else {
            if (h2.floatValue() > h3.floatValue()) {
                float f = width;
                float floatValue = f / h2.floatValue();
                float f2 = (height - floatValue) / 2.0f;
                rectF = new RectF(RecyclerView.A1, f2, f, floatValue + f2);
            } else {
                float f3 = height;
                float floatValue2 = h2.floatValue() * f3;
                float f4 = (width - floatValue2) / 2.0f;
                rectF = new RectF(f4, RecyclerView.A1, floatValue2 + f4, f3);
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

    public final ws4 b(b57 b57Var, Rect rect, int i, boolean z) {
        boolean z2;
        Size size;
        Size size2;
        Pair create;
        if (tw6.c(i)) {
            z2 = true;
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        } else {
            z2 = false;
        }
        if (z) {
            Size f = tw6.f(rect);
            Iterator it = c(b57Var).iterator();
            while (true) {
                if (it.hasNext()) {
                    Size size3 = (Size) it.next();
                    Size f2 = tw6.f(a(size3, f));
                    if (!d(f2, f)) {
                        create = Pair.create(size3, f2);
                        break;
                    }
                } else {
                    create = Pair.create(f, f);
                    break;
                }
            }
            size = (Size) create.first;
            size2 = (Size) create.second;
        } else {
            Size f3 = tw6.f(rect);
            List c = c(b57Var);
            Iterator it2 = c.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Size size4 = (Size) it2.next();
                    Rational rational = uu.a;
                    if (!uu.a(rational, f3)) {
                        rational = uu.c;
                        if (!uu.a(rational, f3)) {
                            rational = h(f3);
                        }
                    }
                    if (!e(rational, size4) && !d(size4, f3)) {
                        size = size4;
                        break;
                    }
                } else {
                    Iterator it3 = c.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            size = (Size) it3.next();
                            if (!d(size, f3)) {
                                break;
                            }
                        } else {
                            size = f3;
                            break;
                        }
                    }
                }
            }
            rect = a(f3, size);
            size2 = size;
        }
        ws4 ws4Var = new ws4(rect, size2, size);
        if (z2) {
            return new ws4(new Rect(rect.top, rect.left, rect.bottom, rect.right), new Size(size2.getHeight(), size2.getWidth()), size);
        }
        return ws4Var;
    }

    public final List c(b57 b57Var) {
        Rational rational;
        if (this.d.contains(b57Var)) {
            HashMap hashMap = this.g;
            if (hashMap.containsKey(b57Var)) {
                List list = (List) hashMap.get(b57Var);
                Objects.requireNonNull(list);
                return list;
            }
            ArrayList m = this.e.m(b57Var);
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            int size = m.size();
            int i = 0;
            while (i < size) {
                Object obj = m.get(i);
                i++;
                Size size2 = (Size) obj;
                Iterator it = hashMap2.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        rational = (Rational) it.next();
                        if (uu.a(rational, size2)) {
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
            hashMap.put(b57Var, arrayList);
            return arrayList;
        }
        f81.x(b57Var, "Invalid child config: ");
        return null;
    }

    public final boolean e(Rational rational, Size size) {
        int i;
        Rational rational2 = this.b;
        if (!rational2.equals(rational) && !uu.a(rational, size)) {
            float floatValue = rational2.floatValue();
            float floatValue2 = rational.floatValue();
            Rational rational3 = uu.a;
            if (!uu.a(rational3, size)) {
                rational3 = uu.c;
                if (!uu.a(rational3, size)) {
                    rational3 = h(size);
                }
            }
            float floatValue3 = rational3.floatValue();
            int i2 = (floatValue > floatValue2 ? 1 : (floatValue == floatValue2 ? 0 : -1));
            if (i2 != 0 && floatValue2 != floatValue3) {
                if (i2 > 0) {
                    if (floatValue2 < floatValue3) {
                        return true;
                    }
                    return false;
                } else if (i > 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public final ArrayList f(List list, boolean z) {
        int i;
        List list2;
        HashMap hashMap = new HashMap();
        Rational rational = uu.a;
        hashMap.put(rational, new ArrayList());
        Rational rational2 = uu.c;
        hashMap.put(rational2, new ArrayList());
        ArrayList arrayList = new ArrayList();
        arrayList.add(rational);
        arrayList.add(rational2);
        Iterator it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                int size2 = arrayList.size();
                while (true) {
                    if (i < size2) {
                        Object obj = arrayList.get(i);
                        i++;
                        Rational rational3 = (Rational) obj;
                        if (uu.a(rational3, size)) {
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
        Collections.sort(arrayList2, new xs1(1, h(this.a)));
        ArrayList arrayList3 = new ArrayList();
        int size3 = arrayList2.size();
        while (i < size3) {
            Object obj2 = arrayList2.get(i);
            i++;
            Rational rational4 = (Rational) obj2;
            if (!rational4.equals(uu.c) && !rational4.equals(uu.a)) {
                List list3 = (List) hashMap.get(rational4);
                Objects.requireNonNull(list3);
                arrayList3.addAll(g(rational4, list3, z));
            }
        }
        return arrayList3;
    }

    public final ArrayList g(Rational rational, List list, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (uu.a(rational, size)) {
                arrayList3.add(size);
            }
        }
        Collections.sort(arrayList3, new es0(true));
        HashSet hashSet = new HashSet(arrayList3);
        Iterator it2 = this.d.iterator();
        while (true) {
            int i = 0;
            if (it2.hasNext()) {
                List<Size> c = c((b57) it2.next());
                if (!z) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Size size2 : c) {
                        if (!e(rational, size2)) {
                            arrayList4.add(size2);
                        }
                    }
                    c = arrayList4;
                }
                if (c.isEmpty()) {
                    return new ArrayList();
                }
                if (!c.isEmpty() && !arrayList3.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    int size3 = arrayList3.size();
                    int i2 = 0;
                    while (i2 < size3) {
                        Object obj = arrayList3.get(i2);
                        i2++;
                        Size size4 = (Size) obj;
                        Iterator it3 = c.iterator();
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
                if (!c.isEmpty() && !arrayList3.isEmpty()) {
                    if (arrayList3.isEmpty()) {
                        arrayList2 = arrayList3;
                    } else {
                        arrayList2 = new ArrayList(new LinkedHashSet(arrayList3));
                    }
                    arrayList = new ArrayList();
                    int size5 = arrayList2.size();
                    while (i < size5) {
                        Object obj2 = arrayList2.get(i);
                        i++;
                        Size size6 = (Size) obj2;
                        Iterator it4 = c.iterator();
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
                while (i < size7) {
                    Object obj3 = arrayList3.get(i);
                    i++;
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
