package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface a2 extends b2 {
    int A();

    int J();

    @Override // d1.y1
    default long c(p pVar, p pVar2, p pVar3) {
        return (J() + A()) * 1000000;
    }
}
