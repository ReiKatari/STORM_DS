package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uo6  reason: default package */
/* loaded from: classes.dex */
public final class uo6 implements nh1 {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public uo6(char c) {
        this.a = c;
    }

    @Override // defpackage.nh1
    public final void a(vz6 vz6Var, vz6 vz6Var2, int i) {
        nh1 nh1Var;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                nh1Var = (nh1) it.next();
                if (nh1Var.c() <= i) {
                    break;
                }
            } else {
                nh1Var = (nh1) linkedList.getFirst();
                break;
            }
        }
        nh1Var.a(vz6Var, vz6Var2, i);
    }

    @Override // defpackage.nh1
    public final char b() {
        return this.a;
    }

    @Override // defpackage.nh1
    public final int c() {
        return this.b;
    }

    @Override // defpackage.nh1
    public final int d(mh1 mh1Var, mh1 mh1Var2) {
        nh1 nh1Var;
        int i = mh1Var.g;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                nh1Var = (nh1) it.next();
                if (nh1Var.c() <= i) {
                    break;
                }
            } else {
                nh1Var = (nh1) linkedList.getFirst();
                break;
            }
        }
        return nh1Var.d(mh1Var, mh1Var2);
    }

    @Override // defpackage.nh1
    public final char e() {
        return this.a;
    }

    public final void f(nh1 nh1Var) {
        int c = nh1Var.c();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int c2 = ((nh1) listIterator.next()).c();
            if (c > c2) {
                listIterator.previous();
                listIterator.add(nh1Var);
                return;
            } else if (c == c2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + c);
            }
        }
        linkedList.add(nh1Var);
        this.b = c;
    }
}
