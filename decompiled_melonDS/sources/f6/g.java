package f6;

import a8.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends View.BaseSavedState {
    public static final Parcelable.Creator<g> CREATOR = new l(20);
    public int A;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" scrollPosition=");
        return w.d.q(sb2, this.A, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.A);
    }
}
