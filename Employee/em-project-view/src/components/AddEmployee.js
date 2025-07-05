import React from 'react'

function AddEmployee() {
    return (
        <div className="bg-slate-700 mx-40 my-20 rounded shadow py-4 px-8 max-w-xl  ">
            <div className='text-4x1 tracking-wider font-bold text-center py-4 px-8'>
                <p>Add New Employee 🤵</p>
            </div>

            <div className='mx-10 my-2'>

                <input className='w-full my-4 py-2' placeholder='Name'></input>
                <input className='w-full my-4 py-2'placeholder='Phone'></input>
                <input className='w-full my-4 py-2'placeholder='Email'></input>
            </div>


            <div className='flex my-4 space-x-4 px-10'>

                <button className='bg-green-400 hover-bg-green-700 py-2 px-6 rounded'>Save</button>
                <button  className='bg-blue-400 hover-bg-blue-700 py-2 px-6 rounded'>Clear</button>
                <button  className='bg-red-400 hover-bg-red-700 py-2 px-6 rounded'>Cancel</button>

            </div>


        </div>
    )
}

export default AddEmployee