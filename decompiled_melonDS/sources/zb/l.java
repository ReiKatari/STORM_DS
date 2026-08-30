package zb;

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
import mh.z;
/* loaded from: classes.dex */
public abstract class l extends o {
    public static final int J(int i2, List list) {
        if (i2 >= 0 && i2 <= list.size() - 1) {
            return (list.size() - 1) - i2;
        }
        StringBuilder i10 = kc.a.i("Element index ", i2, " must be in range [");
        i10.append(new sc.b(0, list.size() - 1, 1));
        i10.append("].");
        throw new IndexOutOfBoundsException(i10.toString());
    }

    public static final int K(int i2, List list) {
        if (i2 >= 0 && i2 <= list.size()) {
            return list.size() - i2;
        }
        StringBuilder i10 = kc.a.i("Position index ", i2, " must be in range [");
        i10.append(new sc.b(0, list.size(), 1));
        i10.append("].");
        throw new IndexOutOfBoundsException(i10.toString());
    }

    public static void L(Iterable iterable, AbstractCollection abstractCollection) {
        abstractCollection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static double M(ArrayList arrayList) {
        int size = arrayList.size();
        double d4 = 0.0d;
        int i2 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d4 += ((Number) obj).floatValue();
            i2++;
            if (i2 < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d4 / i2;
    }

    public static boolean N(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (U(iterable, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static List O(Iterable iterable) {
        LinkedHashSet linkedHashSet;
        iterable.getClass();
        if (iterable instanceof Collection) {
            linkedHashSet = new LinkedHashSet((Collection) iterable);
        } else {
            linkedHashSet = new LinkedHashSet();
            n0(iterable, linkedHashSet);
        }
        return p0(linkedHashSet);
    }

    public static List P(List list) {
        list.getClass();
        int size = list.size() - 1;
        if (size <= 0) {
            return q.A;
        }
        if (size == 1) {
            return p7.t.x(Z(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i2 = 1; i2 < size2; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static Object Q(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return R((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        m9.o.x("Collection is empty.");
        return null;
    }

    public static Object R(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        m9.o.x("List is empty.");
        return null;
    }

    public static Object S(Iterable iterable) {
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

    public static Object T(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static int U(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i2 = 0;
        for (Object obj2 : iterable) {
            if (i2 >= 0) {
                if (nc.k.a(obj, obj2)) {
                    return i2;
                }
                i2++;
            } else {
                p7.t.F();
                throw null;
            }
        }
        return -1;
    }

    public static LinkedHashSet V(Iterable iterable, Iterable iterable2) {
        Collection p0;
        iterable.getClass();
        iterable2.getClass();
        if (iterable2 instanceof Collection) {
            p0 = (Collection) iterable2;
        } else {
            p0 = p0(iterable2);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (p0.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static final void W(Iterable iterable, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, mc.l lVar) {
        iterable.getClass();
        sb2.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb2.append(charSequence);
            }
            p7.m.d(sb2, obj, lVar);
        }
        sb2.append(charSequence3);
    }

    public static /* synthetic */ void X(List list, StringBuilder sb2, z zVar, int i2) {
        if ((i2 & 64) != 0) {
            zVar = null;
        }
        W(list, sb2, "\n", "", "", "...", zVar);
    }

    public static String Y(Iterable iterable, String str, String str2, String str3, mc.l lVar, int i2) {
        String str4;
        String str5;
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i2 & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i2 & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        iterable.getClass();
        StringBuilder sb2 = new StringBuilder();
        W(iterable, sb2, str6, str4, str5, "...", lVar);
        return sb2.toString();
    }

    public static Object Z(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        m9.o.x("List is empty.");
        return null;
    }

    public static Object a0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable b0(ArrayList arrayList) {
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

    public static ArrayList c0(List list, Object obj) {
        list.getClass();
        ArrayList arrayList = new ArrayList(m.G(list, 10));
        boolean z10 = false;
        for (Object obj2 : list) {
            boolean z11 = true;
            if (!z10 && nc.k.a(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList d0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList e0(Collection collection, List list) {
        collection.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static void f0(List list, mc.l lVar) {
        int size;
        list.getClass();
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof oc.a) && !(list instanceof oc.b)) {
                nc.w.f(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) lVar.k(it.next())).booleanValue()) {
                    it.remove();
                }
            }
            return;
        }
        int size2 = list.size() - 1;
        int i2 = 0;
        if (size2 >= 0) {
            int i10 = 0;
            while (true) {
                Object obj = list.get(i2);
                if (!((Boolean) lVar.k(obj)).booleanValue()) {
                    if (i10 != i2) {
                        list.set(i10, obj);
                    }
                    i10++;
                }
                if (i2 == size2) {
                    break;
                }
                i2++;
            }
            i2 = i10;
        }
        if (i2 >= list.size() || i2 > (size = list.size() - 1)) {
            return;
        }
        while (true) {
            list.remove(size);
            if (size != i2) {
                size--;
            } else {
                return;
            }
        }
    }

    public static Object g0(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return arrayList.remove(0);
        }
        m9.o.x("List is empty.");
        return null;
    }

    public static Object h0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        m9.o.x("List is empty.");
        return null;
    }

    public static Object i0(AbstractList abstractList) {
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(abstractList.size() - 1);
    }

    public static List j0(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return p0(iterable);
        }
        List r02 = r0(iterable);
        Collections.reverse(r02);
        return r02;
    }

    public static List k0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return p0(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            Comparable[] comparableArr = (Comparable[]) array;
            comparableArr.getClass();
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            array.getClass();
            List asList = Arrays.asList(array);
            asList.getClass();
            return asList;
        }
        List r02 = r0(iterable);
        o.H(r02);
        return r02;
    }

    public static List l0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return p0(iterable);
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
        List r02 = r0(iterable);
        o.I(r02, comparator);
        return r02;
    }

    public static boolean[] m0(List list) {
        list.getClass();
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        return zArr;
    }

    public static final void n0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static int[] o0(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Number) it.next()).intValue();
            i2++;
        }
        return iArr;
    }

    public static List p0(Iterable iterable) {
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
                return p7.t.x(next);
            }
            return q.A;
        }
        return p7.t.B(r0(iterable));
    }

    public static ArrayList q0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List r0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        n0(iterable, arrayList);
        return arrayList;
    }

    public static Set s0(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(v.E(collection.size()));
                    n0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return p7.j.E(next);
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            n0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                return p7.j.E(linkedHashSet2.iterator().next());
            }
        }
        return s.A;
    }

    public static ArrayList t0(Iterable iterable, List list) {
        list.getClass();
        Iterator it = iterable.iterator();
        Iterator it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(m.G(iterable, 10), m.G(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new yb.j(it.next(), it2.next()));
        }
        return arrayList;
    }
}
