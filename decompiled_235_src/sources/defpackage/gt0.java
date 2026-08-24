package defpackage;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
/* renamed from: gt0 */
/* loaded from: classes.dex */
public abstract class gt0 extends jt0 {
    public static void A0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        for (Object obj : iterable) {
            collection.add(obj);
        }
    }

    public static ev B0(Iterable iterable) {
        iterable.getClass();
        return new ev(iterable, 1);
    }

    public static boolean C0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (L0(iterable, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static List D0(Iterable iterable, int i) {
        ArrayList arrayList;
        Object obj;
        iterable.getClass();
        if (i >= 0) {
            if (i == 0) {
                return k1(iterable);
            }
            if (iterable instanceof Collection) {
                int size = ((Collection) iterable).size() - i;
                if (size <= 0) {
                    return yt1.A;
                }
                if (size == 1) {
                    if (iterable instanceof List) {
                        obj = Q0((List) iterable);
                    } else {
                        Iterator it = iterable.iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            while (it.hasNext()) {
                                next = it.next();
                            }
                            obj = next;
                        } else {
                            fa6.e("Collection is empty.");
                            return null;
                        }
                    }
                    return hf.b0(obj);
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        List list = (List) iterable;
                        int size2 = list.size();
                        while (i < size2) {
                            arrayList.add(list.get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            int i2 = 0;
            for (Object obj2 : iterable) {
                if (i2 >= i) {
                    arrayList.add(obj2);
                } else {
                    i2++;
                }
            }
            return hf.f0(arrayList);
        }
        i.f(lb1.k("Requested element count ", i, " is less than zero."));
        return null;
    }

    public static List E0(List list) {
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return e1(list, size);
    }

    public static final boolean F0(Iterable iterable, qn2 qn2Var, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) qn2Var.g(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static Object G0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return H0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        fa6.e("Collection is empty.");
        return null;
    }

    public static Object H0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        fa6.e("List is empty.");
        return null;
    }

    public static Object I0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static Object J0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object K0(int i, List list) {
        list.getClass();
        if (i >= 0 && i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    public static int L0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i >= 0) {
                if (nb3.k(obj, obj2)) {
                    return i;
                }
                i++;
            } else {
                hf.q0();
                throw null;
            }
        }
        return -1;
    }

    public static LinkedHashSet M0(Iterable iterable, Iterable iterable2) {
        Collection k1;
        iterable.getClass();
        iterable2.getClass();
        if (iterable2 instanceof Collection) {
            k1 = (Collection) iterable2;
        } else {
            k1 = k1(iterable2);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (k1.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static final void N0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, qn2 qn2Var) {
        iterable.getClass();
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            hi2.s(sb, obj, qn2Var);
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void O0(List list, StringBuilder sb, String str, k0 k0Var, int i) {
        if ((i & 64) != 0) {
            k0Var = null;
        }
        N0(list, sb, str, "", "", -1, "...", k0Var);
    }

    public static String P0(Iterable iterable, String str, String str2, String str3, qn2 qn2Var, int i) {
        String str4;
        String str5;
        int i2;
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 5;
        }
        int i3 = i2;
        if ((i & 32) != 0) {
            qn2Var = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        N0(iterable, sb, str6, str4, str5, i3, "...", qn2Var);
        return sb.toString();
    }

    public static Object Q0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        fa6.e("List is empty.");
        return null;
    }

    public static Object R0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable S0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList T0(List list, Object obj) {
        list.getClass();
        ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
        boolean z = false;
        for (Object obj2 : list) {
            boolean z2 = true;
            if (!z && nb3.k(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList U0(Object obj, Collection collection) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList V0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        A0(arrayList2, iterable);
        return arrayList2;
    }

    public static boolean W0(List list, qn2 qn2Var) {
        int i;
        list.getClass();
        qn2Var.getClass();
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof zf3) && !(list instanceof ag3)) {
                ge7.X(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            return F0(list, qn2Var, true);
        }
        int U = hf.U(list);
        if (U >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                Object obj = list.get(i2);
                if (!((Boolean) qn2Var.g(obj)).booleanValue()) {
                    if (i != i2) {
                        list.set(i, obj);
                    }
                    i++;
                }
                if (i2 == U) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int size = list.size() - 1;
        if (i <= size) {
            while (true) {
                list.remove(size);
                if (size == i) {
                    break;
                }
                size--;
            }
        }
        return true;
    }

    public static Object X0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        fa6.e("List is empty.");
        return null;
    }

    public static Object Y0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        fa6.e("List is empty.");
        return null;
    }

    public static Object Z0(AbstractList abstractList) {
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(abstractList.size() - 1);
    }

    public static List a1(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return k1(iterable);
        }
        List n1 = n1(iterable);
        Collections.reverse(n1);
        return n1;
    }

    public static Object b1(List list) {
        list.getClass();
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            i.h("List has more than one element.");
            return null;
        }
        fa6.e("List is empty.");
        return null;
    }

    public static List c1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return k1(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            Comparable[] comparableArr = (Comparable[]) array;
            comparableArr.getClass();
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            return fv.l0(array);
        }
        List n1 = n1(iterable);
        jt0.w0(n1);
        return n1;
    }

    public static List d1(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        comparator.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return k1(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            array.getClass();
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            List asList = Arrays.asList(array);
            asList.getClass();
            return asList;
        }
        List n1 = n1(iterable);
        jt0.x0(n1, comparator);
        return n1;
    }

    public static List e1(Iterable iterable, int i) {
        iterable.getClass();
        if (i >= 0) {
            if (i == 0) {
                return yt1.A;
            }
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return k1(iterable);
                }
                if (i == 1) {
                    return hf.b0(G0(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (Object obj : iterable) {
                arrayList.add(obj);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return hf.f0(arrayList);
        }
        i.f(lb1.k("Requested element count ", i, " is less than zero."));
        return null;
    }

    public static List f1(int i, List list) {
        if (i >= 0) {
            if (i == 0) {
                return yt1.A;
            }
            int size = list.size();
            if (i >= size) {
                return k1(list);
            }
            if (i == 1) {
                return hf.b0(Q0(list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
        i.f(lb1.k("Requested element count ", i, " is less than zero."));
        return null;
    }

    public static boolean[] g1(List list) {
        list.getClass();
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static final void h1(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static float[] i1(List list) {
        list.getClass();
        float[] fArr = new float[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static int[] j1(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List k1(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return new ArrayList(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return hf.b0(next);
            }
            return yt1.A;
        }
        return hf.f0(n1(iterable));
    }

    public static long[] l1(Collection collection) {
        collection.getClass();
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static ArrayList m1(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List n1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        h1(iterable, arrayList);
        return arrayList;
    }

    public static Set o1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        h1(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set p1(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(c14.k0(collection.size()));
                    h1(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return ii2.R(next);
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            h1(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                return ii2.R(linkedHashSet2.iterator().next());
            }
        }
        return du1.A;
    }

    public static ArrayList q1(List list, List list2) {
        list2.getClass();
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(ht0.v0(list, 10), ht0.v0(list2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new vr4(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final int y0(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder t = xg6.t("Element index ", i, " must be in range [");
        t.append(new j93(0, list.size() - 1, 1));
        t.append("].");
        throw new IndexOutOfBoundsException(t.toString());
    }

    public static final int z0(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder t = xg6.t("Position index ", i, " must be in range [");
        t.append(new j93(0, list.size(), 1));
        t.append("].");
        throw new IndexOutOfBoundsException(t.toString());
    }
}
