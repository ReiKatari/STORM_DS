package defpackage;

import java.util.AbstractSet;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d1  reason: default package */
/* loaded from: classes.dex */
public abstract class d1 extends AbstractSet implements Set, j93 {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}
