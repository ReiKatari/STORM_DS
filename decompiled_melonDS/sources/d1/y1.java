package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface y1 {
    p F(long j2, p pVar, p pVar2, p pVar3);

    p L(long j2, p pVar, p pVar2, p pVar3);

    boolean a();

    long c(p pVar, p pVar2, p pVar3);

    default p t(p pVar, p pVar2, p pVar3) {
        return L(c(pVar, pVar2, pVar3), pVar, pVar2, pVar3);
    }
}
