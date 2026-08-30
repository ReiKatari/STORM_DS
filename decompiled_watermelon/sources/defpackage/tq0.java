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
/* renamed from: tq0 */
/* loaded from: classes.dex */
public abstract class tq0 extends wq0 {
    public static final int B0(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder s = wh1.s("Element index ", i, " must be in range [");
        s.append(new b33(0, list.size() - 1, 1));
        s.append("].");
        throw new IndexOutOfBoundsException(s.toString());
    }

    public static final int C0(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder s = wh1.s("Position index ", i, " must be in range [");
        s.append(new b33(0, list.size(), 1));
        s.append("].");
        throw new IndexOutOfBoundsException(s.toString());
    }

    public static void D0(Collection collection, Iterable iterable) {
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

    public static mu E0(Iterable iterable) {
        iterable.getClass();
        return new mu(1, iterable);
    }

    public static boolean F0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (O0(iterable, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static List G0(int i, List list) {
        list.getClass();
        if (i >= 0) {
            if (i == 0) {
                return n1(list);
            }
            int size = list.size() - i;
            if (size <= 0) {
                return pp1.A;
            }
            if (size == 1) {
                return l07.b0(T0(list));
            }
            ArrayList arrayList = new ArrayList(size);
            if (list instanceof RandomAccess) {
                int size2 = list.size();
                while (i < size2) {
                    arrayList.add(list.get(i));
                    i++;
                }
            } else {
                ListIterator listIterator = list.listIterator(i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
        i.g(wh1.j("Requested element count ", i, " is less than zero."));
        return null;
    }

    public static List H0(List list) {
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return h1(size, list);
    }

    public static final boolean I0(Iterable iterable, mi2 mi2Var, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) mi2Var.n(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static Object J0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return K0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        vd6.e("Collection is empty.");
        return null;
    }

    public static Object K0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        vd6.e("List is empty.");
        return null;
    }

    public static Object L0(Iterable iterable) {
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

    public static Object M0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object N0(int i, List list) {
        list.getClass();
        if (i >= 0 && i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    public static int O0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i >= 0) {
                if (b53.x(obj, obj2)) {
                    return i;
                }
                i++;
            } else {
                l07.v0();
                throw null;
            }
        }
        return -1;
    }

    public static LinkedHashSet P0(Iterable iterable, Iterable iterable2) {
        Collection n1;
        iterable.getClass();
        iterable2.getClass();
        if (iterable2 instanceof Collection) {
            n1 = (Collection) iterable2;
        } else {
            n1 = n1(iterable2);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (n1.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static final void Q0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, mi2 mi2Var) {
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
            yf2.i(sb, obj, mi2Var);
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void R0(List list, StringBuilder sb, String str, j0 j0Var, int i) {
        if ((i & 64) != 0) {
            j0Var = null;
        }
        Q0(list, sb, str, "", "", -1, "...", j0Var);
    }

    public static String S0(Iterable iterable, String str, String str2, String str3, mi2 mi2Var, int i) {
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
            mi2Var = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        Q0(iterable, sb, str6, str4, str5, i3, "...", mi2Var);
        return sb.toString();
    }

    public static Object T0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        vd6.e("List is empty.");
        return null;
    }

    public static Object U0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable V0(ArrayList arrayList) {
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

    public static ArrayList W0(List list, Object obj) {
        list.getClass();
        ArrayList arrayList = new ArrayList(uq0.y0(list, 10));
        boolean z = false;
        for (Object obj2 : list) {
            boolean z2 = true;
            if (!z && b53.x(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList X0(Collection collection, Iterable iterable) {
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
        D0(arrayList2, iterable);
        return arrayList2;
    }

    public static ArrayList Y0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static boolean Z0(List list, mi2 mi2Var) {
        int i;
        list.getClass();
        mi2Var.getClass();
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof f93) && !(list instanceof g93)) {
                l07.t0(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            return I0(list, mi2Var, true);
        }
        int P = l07.P(list);
        if (P >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                Object obj = list.get(i2);
                if (!((Boolean) mi2Var.n(obj)).booleanValue()) {
                    if (i != i2) {
                        list.set(i, obj);
                    }
                    i++;
                }
                if (i2 == P) {
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

    public static Object a1(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        vd6.e("List is empty.");
        return null;
    }

    public static Object b1(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        vd6.e("List is empty.");
        return null;
    }

    public static Object c1(AbstractList abstractList) {
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(abstractList.size() - 1);
    }

    public static List d1(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return n1(iterable);
        }
        List q1 = q1(iterable);
        Collections.reverse(q1);
        return q1;
    }

    public static Object e1(List list) {
        list.getClass();
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            i.i("List has more than one element.");
            return null;
        }
        vd6.e("List is empty.");
        return null;
    }

    public static List f1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return n1(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            Comparable[] comparableArr = (Comparable[]) array;
            comparableArr.getClass();
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            return nu.X(array);
        }
        List q1 = q1(iterable);
        wq0.z0(q1);
        return q1;
    }

    public static List g1(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        comparator.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return n1(iterable);
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
        List q1 = q1(iterable);
        wq0.A0(q1, comparator);
        return q1;
    }

    public static List h1(int i, List list) {
        list.getClass();
        if (i >= 0) {
            if (i == 0) {
                return pp1.A;
            }
            if (i >= list.size()) {
                return n1(list);
            }
            if (i == 1) {
                return l07.b0(J0(list));
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (Object obj : list) {
                arrayList.add(obj);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return l07.k0(arrayList);
        }
        i.g(wh1.j("Requested element count ", i, " is less than zero."));
        return null;
    }

    public static List i1(int i, List list) {
        if (i >= 0) {
            if (i == 0) {
                return pp1.A;
            }
            int size = list.size();
            if (i >= size) {
                return n1(list);
            }
            if (i == 1) {
                return l07.b0(T0(list));
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
        i.g(wh1.j("Requested element count ", i, " is less than zero."));
        return null;
    }

    public static boolean[] j1(List list) {
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

    public static final void k1(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static float[] l1(List list) {
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

    public static int[] m1(List list) {
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

    public static List n1(Iterable iterable) {
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
                return l07.b0(next);
            }
            return pp1.A;
        }
        return l07.k0(q1(iterable));
    }

    public static long[] o1(Collection collection) {
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

    public static ArrayList p1(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List q1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        k1(iterable, arrayList);
        return arrayList;
    }

    public static Set r1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        k1(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set s1(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(zt3.j0(collection.size()));
                    k1(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return hi2.X(next);
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            k1(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                return hi2.X(linkedHashSet2.iterator().next());
            }
        }
        return up1.A;
    }

    public static ArrayList t1(List list, List list2) {
        list2.getClass();
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(uq0.y0(list, 10), uq0.y0(list2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new ti4(it.next(), it2.next()));
        }
        return arrayList;
    }
}
