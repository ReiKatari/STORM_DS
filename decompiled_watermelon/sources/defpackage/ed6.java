package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ed6  reason: default package */
/* loaded from: classes.dex */
public final class ed6 implements ld1 {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public ed6(char c) {
        this.a = c;
    }

    @Override // defpackage.ld1
    public final char a() {
        return this.a;
    }

    @Override // defpackage.ld1
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ld1
    public final int c(kd1 kd1Var, kd1 kd1Var2) {
        ld1 ld1Var;
        int i = kd1Var.g;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                ld1Var = (ld1) it.next();
                if (ld1Var.b() <= i) {
                    break;
                }
            } else {
                ld1Var = (ld1) linkedList.getFirst();
                break;
            }
        }
        return ld1Var.c(kd1Var, kd1Var2);
    }

    @Override // defpackage.ld1
    public final void d(jn6 jn6Var, jn6 jn6Var2, int i) {
        ld1 ld1Var;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                ld1Var = (ld1) it.next();
                if (ld1Var.b() <= i) {
                    break;
                }
            } else {
                ld1Var = (ld1) linkedList.getFirst();
                break;
            }
        }
        ld1Var.d(jn6Var, jn6Var2, i);
    }

    @Override // defpackage.ld1
    public final char e() {
        return this.a;
    }

    public final void f(ld1 ld1Var) {
        int b = ld1Var.b();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int b2 = ((ld1) listIterator.next()).b();
            if (b > b2) {
                listIterator.previous();
                listIterator.add(ld1Var);
                return;
            } else if (b == b2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + b);
            }
        }
        linkedList.add(ld1Var);
        this.b = b;
    }
}
