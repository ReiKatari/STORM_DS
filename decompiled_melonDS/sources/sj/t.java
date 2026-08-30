package sj;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import vj.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t implements yj.a {

    /* renamed from: a  reason: collision with root package name */
    public final char f13038a;

    /* renamed from: b  reason: collision with root package name */
    public int f13039b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedList f13040c = new LinkedList();

    public t(char c4) {
        this.f13038a = c4;
    }

    @Override // yj.a
    public final char a() {
        return this.f13038a;
    }

    @Override // yj.a
    public final int b(e eVar, e eVar2) {
        yj.a aVar;
        int i2 = eVar.f12965g;
        LinkedList linkedList = this.f13040c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (yj.a) it.next();
                if (aVar.c() <= i2) {
                    break;
                }
            } else {
                aVar = (yj.a) linkedList.getFirst();
                break;
            }
        }
        return aVar.b(eVar, eVar2);
    }

    @Override // yj.a
    public final int c() {
        return this.f13039b;
    }

    @Override // yj.a
    public final void d(u uVar, u uVar2, int i2) {
        yj.a aVar;
        LinkedList linkedList = this.f13040c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (yj.a) it.next();
                if (aVar.c() <= i2) {
                    break;
                }
            } else {
                aVar = (yj.a) linkedList.getFirst();
                break;
            }
        }
        aVar.d(uVar, uVar2, i2);
    }

    @Override // yj.a
    public final char e() {
        return this.f13038a;
    }

    public final void f(yj.a aVar) {
        int c4 = aVar.c();
        LinkedList linkedList = this.f13040c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int c10 = ((yj.a) listIterator.next()).c();
            if (c4 > c10) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (c4 == c10) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f13038a + "' and minimum length " + c4);
            }
        }
        linkedList.add(aVar);
        this.f13039b = c4;
    }
}
