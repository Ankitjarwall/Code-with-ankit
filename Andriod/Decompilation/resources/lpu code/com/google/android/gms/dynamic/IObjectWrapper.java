package com.google.android.gms.dynamic;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface IObjectWrapper
  extends IInterface
{
  public static abstract class zza
    extends Binder
    implements IObjectWrapper
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
    }
    
    public static IObjectWrapper zzcd(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
      if ((localIInterface != null) && ((localIInterface instanceof IObjectWrapper))) {
        return (IObjectWrapper)localIInterface;
      }
      return new zza(paramIBinder);
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      }
      paramParcel2.writeString("com.google.android.gms.dynamic.IObjectWrapper");
      return true;
    }
    
    private static class zza
      implements IObjectWrapper
    {
      private IBinder zzrk;
      
      zza(IBinder paramIBinder)
      {
        this.zzrk = paramIBinder;
      }
      
      public IBinder asBinder()
      {
        return this.zzrk;
      }
    }
  }
}


/* Location:              C:\Users\ankit\Documents\GitHub\code-with-ankit\Andriod\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\dynamic\IObjectWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */